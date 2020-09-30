import java.util.*;

public class CleanUp{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int d=sc.nextInt();
			HashSet<Integer> set=new HashSet<>();
			for(int j=0;j<d;j++) set.add(sc.nextInt());
			clean(n,d,set);
		}
	}
	public static void clean(int n,int d,HashSet<Integer> set){
		ArrayList<Integer> helper=new ArrayList<>();
		boolean chef=false;
		for(int i=1;i<=n;i++){
			if(!set.contains(i)){
				if(chef==false)
				{System.out.print(i+" "); chef=true;}
				else
				{helper.add(i);chef=false;}
			}
		}
		System.out.println();
		for(int i=0;i<helper.size();i++)
		System.out.print(helper.get(i)+" ");
		System.out.println();
	}
}