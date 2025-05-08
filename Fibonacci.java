import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
//		Scanner scn=new Scanner(System.in);
//		System.out.println("fibonacci series:");
//		int s=scn.nextInt();
//		
//		int f=0,se=1,n;
//		if(s==0) {
//			System.out.println("enter value more than 1"); 
//		}
//		else if (s==1){
//			System.out.println(s);
//		}
//		else if(s>1) {
//	 for(int i=0;i<=s;i++) {
//		 System.out.println(f+",");
//		 n=f+se;
//		 f=se;
//		 se=n;
//	 }
//		}
//scn.close();
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the number of series:");
		int num=scanner.nextInt();
		int firstnum=0;
		int secondnum=1;
		int nextnum;
		
		if(num<1) System.out.println("enter value more than zero!!");
		else {
			for(int i=0;i<=num;i++) {
			System.out.println(firstnum+" ");
			nextnum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
			}
		}
	}

}
