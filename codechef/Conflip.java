// if initial is head { heads=n/2; tails=n-heads;} else {tails=n/2;heads=n-tails;}
import java.util.*;

public class Conflip{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int g=sc.nextInt();
			for(int j=0;j<g;j++){
				int initial=sc.nextInt();
				int n=sc.nextInt();
				int q=sc.nextInt();
				System.out.println(findCoin(initial,n,q));
			}
		}
	}
	public static int findCoin(int i,int n,int q){
		int heads,tails;
		if(i==1){
			heads=n/2;
			tails=n-heads;
		}
		else{
			tails=n/2;
			heads=n-tails;
		}
		if(q==1) return heads;
		else return tails;
	}
}