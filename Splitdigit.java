import java.util.Scanner;
public class Splitdigit {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println("enter the value: ");
		int a= abc.nextInt();
		abc.close();
		while(a!=0) {
			int r=a%10;
			System.out.println(r);
			a=a/10;
		}
	}

}
