import java.util.*;
public class Johny{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int j=0;j<n;j++) arr[j]=sc.nextInt();
			int k=sc.nextInt();
			System.out.println(johnySong(arr,n,k));
		}
	}
	public static int johnySong(int arr[],int n,int k){
		int result=0;
		for(int i=0;i<n;i++){
			if(arr[k-1]>=arr[i]) result++;
		}
		return result;
	}
}