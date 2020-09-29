import java.util.*;

public class Horses{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int j=0;j<n;j++) arr[j]=sc.nextInt();
			System.out.println(minDifference(arr,n));
		}
	}
	public static int minDifference(int arr[],int n){
		int answer;
		Arrays.sort(arr); answer=Math.abs(arr[0]-arr[1]);
		for(int i=1;i<n-1;i++){
			answer=Math.min(Math.abs(arr[i]-arr[i+1]),answer);
		}
		return answer;
	}
}