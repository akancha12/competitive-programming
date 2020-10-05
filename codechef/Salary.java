import java.util.*;

class Salary{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int pay[]=new int[n];
			int min=Integer.MAX_VALUE;
			for(int j=0;j<n;j++){
				pay[j]=sc.nextInt();
				if(min>pay[j]) min=pay[j];
			}
			System.out.println(countMoves(pay,n,min));
		}
	}
	public static int countMoves(int pay[],int n,int min){
		int moves=0;
		for(int i=0;i<n;i++){
			moves+=(pay[i]-min);
		}
		return moves;
	}
}