import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the number A: ");
		int a= scn.nextInt();
		System.out.println("Enter the number B: ");
		int b= scn.nextInt();
		scn.close();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("The value of A: "+a);
		System.out.print("The value of B: "+b);
		

	}
}
