import java.util.*;

class AtmQueue{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int result[][]=new int[t][];
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int bound=sc.nextInt();
            ArrayList<Node> withdraw=new ArrayList<>();
            for(int j=0;j<n;j++){
		int amount=sc.nextInt(),atmUsage; 
		if(amount%bound==0)atmUsage=amount/bound;
		else atmUsage=amount/bound+1;
		withdraw.add(new Node(j+1,amount,atmUsage));
	    }
            result[i]=returnOrder(withdraw,n,bound);
        }
        for(int i=0;i<t;i++){
            System.out.print("Case #"+(i+1)+": ");
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[] returnOrder(ArrayList<Node> line,int n,int bound){
	Collections.sort(line,new Comparator<Node>(){
		public int compare(Node n1,Node n2){
			return n1.timesAtmUsed.compareTo(n2.timesAtmUsed);
		}
	});
	int result[]=new int[n];
	for(int i=0;i<n;i++) result[i]=line.get(i).index;
	return result;
    }
}
class Node{
    int index;
    int amount;
    Integer timesAtmUsed;
    Node(int index,int amount,int timesAtmUsed){
        this.index=index;
        this.amount=amount;
	this.timesAtmUsed=timesAtmUsed;
    }
}