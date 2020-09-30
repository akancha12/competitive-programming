import java.util.*;

class ONP{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		for(int i=0;i<t;i++){
			char arr[]=sc.nextLine().toCharArray();
			postFix(arr,arr.length);
		}
	}
	public static void postFix(char arr[],int n){
		Stack<Character> stack=new Stack<>();
		for(char c:arr){
			if(c==')'){
				while(stack.peek()!='('){
					System.out.print(stack.pop());
				}
				stack.pop();
			}
			else if(c=='('||c=='+'||c=='-'||c=='*'||c=='/'||c=='^'){
				stack.push(c);
			}
			else System.out.print(c);
		}
		System.out.println();
	}
}