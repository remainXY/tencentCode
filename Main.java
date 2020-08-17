
import java.util.Scanner;
public class Main{
	public static int getCount(int []num) {
		int res=-1;
		for(int i=0;i<num.length;i++) {
			while(num[i]!=i) {
				if(num[num[i]]==num[i]) {
					res=num[i];
					return res;
				}
				int temp=num[num[i]];
				num[num[i]]=num[i];
				num[i]=temp;
			}
		}
		return res;
	}
	public static void printNum(int []num) {
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int []num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=(int)(Math.random()*n);
		}
		int res=getCount(num);
		System.out.println(res);
	}
}