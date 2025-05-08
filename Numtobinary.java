import java.util.Scanner;
public class Numtobinary {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=scn.nextInt();
		String x="";
		while(n>0) {
			int a=n%2;
			x=a+x;
			n=n/2;
		}
		
		System.out.println(x);
		scn.close();

	}

}
