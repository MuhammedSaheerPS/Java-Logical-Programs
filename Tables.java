import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.println(" enter the table: ");
		int a=abc.nextInt();
		abc.close();
		for(int i=1;i<=10;i++) {
			System.out.println(a+"x"+i+"="+(a*i));
		}

	}

}
