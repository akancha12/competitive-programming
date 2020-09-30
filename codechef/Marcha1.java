import java.util.*;

class Marcha1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int money[]=new int[n];
			int sumAsked=sc.nextInt();
			for(int j=0;j<n;j++) money[j]=sc.nextInt();
			if(isMugged(money,n,sumAsked)) System.out.println("Yes");
			else System.out.println("No");
		}
	}
	public static boolean isMugged(int money[],int n,int askedMoney){
		if(askedMoney==0) return true;
		if(n==0) return false;
		if(money[n-1]<=askedMoney)
			return isMugged(money,n-1,askedMoney-money[n-1]) || isMugged(money,n-1,askedMoney);
		else return isMugged(money,n-1,askedMoney);
	}
}