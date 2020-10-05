import java.util.*;

class S{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		char pixels[][]=new char[3][n];
		String s="";
		pixels[0]=sc.nextLine().toCharArray();
		pixels[1]=sc.nextLine().toCharArray();
		pixels[2]=sc.nextLine().toCharArray();
		for(int i=0;i<n;i+=4){
			if(pixels[1][i+1]=='.'){
				if(pixels[0][i+1]=='.') s+="U";
				else s+="O";
			}
			else if(pixels[0][i]=='.') s+=("A");
			else if(pixels[1][i]=='.') s+=("I");
			else s+=("E");
			if(i+4<n) s+=("*");
		}
		System.out.print(s);
	}
}