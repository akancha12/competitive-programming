import java.util.*;

class Carvans{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int maxSpeeds[]=new int[n];
			for(int j=0;j<n;j++) maxSpeeds[j]=sc.nextInt();
			System.out.println(findMaxSpeedCars(maxSpeeds,n));
		}
	}
	public static int findMaxSpeedCars(int maxSpeeds[],int n){
		if(n==0) System.out.println("0");
		int answer=1;
		int prevSpeed=maxSpeeds[0];
		for(int i=1;i<n;i++){
			if(maxSpeeds[i]>prevSpeed) continue;
			answer++; prevSpeed=maxSpeeds[i];
		}
		return answer;
	}
}