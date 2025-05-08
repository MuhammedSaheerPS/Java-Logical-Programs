import java.util.Scanner;
public class Posneg {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scn.nextInt();
		scn.close();
		String A= num>=0?"its a positive number":"its a negative number";
		System.out.println(A);

	}

}
