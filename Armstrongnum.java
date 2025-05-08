import java.util.Scanner;
public class Armstrongnum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number:");
		int s=scn.nextInt();
		int temp=s;
		int len=String.valueOf(s).length();
		int r=0;
		while(s!=0) {
			int t=s%10;
			r+=Math.pow(t, len);
			s=s/10;
		}
		if(r==temp) {
			System.out.println("its armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}
		
scn.close();
	}

}
