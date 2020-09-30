import java.util.*;

class CSUB{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		for(int i=0;i<t;i++){
			int n=Integer.parseInt(sc.nextLine());
			char arr[]=sc.nextLine().toCharArray();
			System.out.println(countSubstrings(arr,n));
		}
	}
	public static long countSubstrings(char arr[],int n){
		int count=0;
		for(char c:arr){
			if(c=='1') count++;
		}
		if(count==0) return 0;
		long result=(count*(count-1))/2;
		return result+count;
	}
}