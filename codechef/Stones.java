import java.util.*;

class Stones{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		for(int i=0;i<t;i++){
			String jewel=sc.nextLine();
			String mined=sc.nextLine();
			System.out.println(countJewels(jewel,mined));
		}
	}
	public static int countJewels(String jewel,String mined){
		HashSet<Character> j=new HashSet<>();
		int count=0;
		for(int i=0;i<jewel.length();i++) j.add(jewel.charAt(i));
		for(int i=0;i<mined.length();i++){
			if(j.contains(mined.charAt(i))) count++;
		}
		return count;
	}
}