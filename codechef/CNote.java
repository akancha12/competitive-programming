import java.util.*;
public class CNote{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int k=sc.nextInt();
			int n=sc.nextInt();
			boolean isLucky=false;
			for(int j=0;j<n;j++){
				int pages=sc.nextInt();
				int price=sc.nextInt();
				if(price<=k && pages>=(x-y)) isLucky=true;
			}
			if(isLucky) System.out.println("LuckyChef");
			else System.out.println("UnluckyChef");
		}
	}
}