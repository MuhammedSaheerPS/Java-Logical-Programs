import java.util.Scanner;
public class Multiwthfor {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println(" enter the number 1 : ");
		int a=abc.nextInt();
		System.out.println(" enter the number 2 : ");
		int b=abc.nextInt();
		abc.close();
		int sum=0;
		for(int i=1;i<=a;i++) {
			sum=sum+b;
			System.out.println(sum);
		}

	}

}
