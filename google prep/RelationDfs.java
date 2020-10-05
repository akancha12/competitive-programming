import java.util.*;

class Relations{
	String parent;
	String child;
	Relations(String parent,String child){
		this.parent=parent;
		this.child=child;
	}
}

class RelationDfs{
	public static void main(String args[]){
		List<Relations> relation=new ArrayList<>();
		relation.add(new Relations("animal","mammal"));
		relation.add(new Relations("animal","bird"));
		relation.add(new Relations("lifeform","animal"));
		relation.add(new Relations("cat","lion"));
		relation.add(new Relations("mammal","cat"));
		relation.add(new Relations("animal","fish"));
		printTree(relation);
	}
	public static void printTree(List<Relations> relation){
		HashMap<String,List<String>> relationship=new HashMap<>();
		HashSet<String> childs=new HashSet<>();
		for(int i=0;i<relation.size();i++){
			if(relationship.containsKey(relation.get(i).parent))
				relationship.get(relation.get(i).parent).add(relation.get(i).child);
			else{
				List<String> temp=new ArrayList<>();
				temp.add(relation.get(i).child);
				relationship.put(relation.get(i).parent,temp);
			}
			childs.add(relation.get(i).child);
		}
		String root="";
		for(int i=0;i<relation.size();i++){
			if(!childs.contains(relation.get(i).parent)){
				root=relation.get(i).parent;
			}
		}
		System.out.println(root);
		Stack<String> stack=new Stack<>();
		stack.push(root);int d=0;
		while(stack.size()!=0){
			if(!relationship.containsKey(stack.peek())){
				stack.pop();d--;}
			if(relationship.get(stack.peek()).size()==0)
				{stack.pop();d--;}
			else{
				String x=relationship.get(stack.peek()).get(0);
				relationship.get(stack.peek()).remove(x);
				stack.push(x); d++;
				for(int j=0;j<d;j++) System.out.print("   ");
				System.out.println(x);
			}
		}
	}
}