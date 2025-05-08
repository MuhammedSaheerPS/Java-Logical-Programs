import java.util.Scanner;
public class Simpleinterest {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Principle amount: ");
		int pri=scn.nextInt();
		System.out.println("Enter the Rate of interest: ");
		float rat=scn.nextFloat();
		System.out.println("Enter the time period (years): ");
		float tim=scn.nextFloat();
		scn.close();
		float tot= pri*rat*tim/100;
		float amt=pri+tot;
		System.out.println("the total amount: "+amt);
		System.out.println("the interest amount: "+tot);
		
	
	}

}
