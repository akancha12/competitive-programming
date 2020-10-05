
import java.util.*;

class Nukes{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		int bound=sc.nextInt();
		int chambers=sc.nextInt();
		int result[]=findReactorState(a,bound,chambers);
		for(int i=0;i<chambers;i++) System.out.print(result[i]+" ");
	}
	public static int[] findReactorState(long a,int bound,int chambers){
		int reactorState[]=new int[chambers];
		long limit=((long)Math.pow(bound+1,chambers)-1);
		if(a>limit) a=a%(limit+1);
		for(int i=chambers-1;i>=0;i--){
			long x=(long)Math.pow(bound+1,i);
			if(x<=a){
				reactorState[i]=(int)(a/x);
				a=a-reactorState[i]*x;
			}
		}
		return reactorState;
	}
}