import java.util.*;

class MetalHarvest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int result[]=new int[t];
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			int k=sc.nextInt();
			ArrayList<Interval> intervalList=new ArrayList<>();
			for(int j=0;j<n;j++){
				intervalList.add(new Interval(sc.nextInt(),sc.nextInt()));
			}
			result[i]=calculateDeployments(intervalList,n,k);
		}
		for(int i=0;i<t;i++){
			System.out.println("Case #"+(i+1)+": "+result[i]);
		}
	}
	public static int calculateDeployments(ArrayList<Interval> list,int n,int k){
		Collections.sort(list,new Comparator<Interval>(){
			public int compare(Interval i1,Interval i2){
				return i1.start.compareTo(i2.start);
			}
		});
		int count;
		if(list.get(0).duration%k==0) count=list.get(0).duration/k;
		else count=(list.get(0).duration/k)+1;
		int lastHarvest=list.get(0).start+(count*k);
		for(int i=1;i<n;i++){
			if(list.get(i).end<=lastHarvest) continue;
			int dur=list.get(i).end-Math.max(lastHarvest,list.get(i).start);
			int numRovers;
			if(dur%k==0) numRovers=dur/k;
			else numRovers=dur/k+1;
			count+=numRovers;
			lastHarvest=Math.max(lastHarvest,list.get(i).start)+numRovers*k;
		}
		return count;
	}
}
class Interval{
	Integer start;
	int end;
	int duration;
	Interval(int start,int end){
		this.start=start;
		this.end=end;
		duration=end-start;
	}
}