import java.util.Scanner;
public class Largestnum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Ent the first number: ");
		int a=scn.nextInt();
		System.out.println("Ent the second number: ");
		int b=scn.nextInt();
		System.out.println("Ent the third number: ");
		int c=scn.nextInt();
		scn.close();
		if (a>b&&a>c){
			System.out.println(a+" is the largest");
			
		}
		else if (b>a&&b>c) {
			System.out.println(b+" is the largest");
		}
		else if (c>a&&c>b) {
			System.out.println(c+" is the largest");
		}

	}

}
