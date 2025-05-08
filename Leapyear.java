import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the year: ");
		int ye= scn.nextInt();
		scn.close();
		String a=(ye%100!=0) && (ye%4==0)||ye%400==0?"Its a leapyear":"Its not the leap year";
		System.out.println(a);
		
		
		
		if((ye%100!=0&&ye%4==0)||ye%400==0)System.out.println("its a leap year!!!!");
		else System.out.println("not a leap year");

	}

}
