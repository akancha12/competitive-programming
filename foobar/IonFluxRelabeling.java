import java.util.*;

class IonFluxRelabeling{
	public static void main(String args[]){
		int h=1;
		int q[]={7,3,5,1};
		System.out.println(Arrays.toString(solution(h,q)));
	}
	public static int[] solution(int h,int[] q){
		int result[]=new int[q.length];
		for(int i=0;i<q.length;i++){
			result[i]=findAncestor(h,q[i]);
		}
		return result;
	}
	public static int findAncestor(int h,int num){
		int curNode=(int)(Math.pow(2,h))-1;
		if(num>=curNode) return -1;
		int x=h;
		for(int i=0;i<h-1;i++){
			int rightNode=curNode-1;
			int numNodesEach=(int)Math.pow(2,--x)-1;
			int leftNode=rightNode-numNodesEach;
			if(num==leftNode || num==rightNode) return curNode;
			else if(num<leftNode) curNode=leftNode;
			else curNode=rightNode;
		}
		return -1;
	}
}