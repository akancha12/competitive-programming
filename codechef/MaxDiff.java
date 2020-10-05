import java.util.*;

class MaxDiff{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int weigh[]=new int[n];
			for(int j=0;j<n;j++) weigh[j]=sc.nextInt();
			System.out.println(maxDiff(weigh,n,k));
		}
	}
	public static int maxDiff(int weigh[],int n,int k){
		Arrays.sort(weigh);
		int sum1=0,sum2=0,totalSum=0;
		for(int i=0;i<n;i++){
			totalSum+=weigh[i];
			if(i<k) sum1+=weigh[i];
			if(i<n-k) sum2+=weigh[i];
		}
		return Math.max(Math.abs(totalSum-2*sum1),Math.abs(totalSum-2*sum2));
	}
}