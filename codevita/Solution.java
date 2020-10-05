import java.util.*;

class Solution{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		long price1=0,price2=0;
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int c1=sc.nextInt();
		int d1=sc.nextInt();
		int e1=sc.nextInt();
		price1=(b1*d1)/a1;
		price1+=c1+e1;
		int a2=sc.nextInt();
		int b2=sc.nextInt();
		int c2=sc.nextInt();
		int d2=sc.nextInt();
		int e2=sc.nextInt();
		price2=(b2*d2)/a2;
		price2+=c2+e2;
		if(price1<price2) System.out.println("petrol");
		else System.out.println("diesel");
	}

}