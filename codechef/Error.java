import java.util.*;

class Error{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		for(int i=0;i<t;i++){
			String s=sc.nextLine();
			if(isSubstring(s)) System.out.println("Good");
			else System.out.println("Bad");
		}
	}
	public static boolean isSubstring(String s){
		int n=s.length();
		for(int i=0;i<n-2;i++){
			if(s.charAt(i)=='0'){
				if(s.charAt(i+1)=='1' && s.charAt(i+2)=='0') return true;
			}
			else if(s.charAt(i+1)=='0' && s.charAt(i+2)=='1') return true;
		}
		return false;
	}
}
