import java.util.*;
import java.math.BigInteger;
class PowerHungry{
	public static void main(String args[]){
		int xs[]={100000,100000,100000,100000,100000,100000,100000};
		System.out.println(solution(xs));
	}
	public static String solution(int[] xs) {
		Arrays.sort(xs);
        	if(xs.length==1) return xs[0]+"";
		int negIndex=0;
		boolean isZero=false,isPos=false;
		BigInteger ansNeg=new BigInteger("1"); 
		BigInteger ans=new BigInteger("1");
		for(negIndex=0;negIndex<xs.length;negIndex++){
			if(xs[negIndex]>=0) break; 
		}
		for(int i=negIndex;i<xs.length;i++){
			if(xs[i]==0) isZero=true;
			else {isPos=true;ans=ans.multiply(BigInteger.valueOf(xs[i]));}
		}
		for(int i=1;i<negIndex;i+=2){ ansNeg=ansNeg.multiply(BigInteger.valueOf(xs[i]*xs[i-1]));}
		if(isPos) return (ansNeg.multiply(ans))+"";
		else if(isZero){
			if(negIndex<=1) return "0";
			else return ansNeg+"";
		}
		else return ansNeg+"";
    }
}