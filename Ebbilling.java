import java.util.Scanner;
public class Ebbilling {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println(" ENTER THE UNIT: ");
		float a=scn.nextFloat();
		scn.close();
		if (a<=100) {
			System.out.println("its free of cost");
		}
		else if(a>100&&a<=200) {
			float aa = a*0.80f;
			System.out.println("your bill amount is: "+aa);
		}
		else if(a>200&&a<=300) {
			float bb = a*1f;
			System.out.println("your bill amount is: "+bb);
		}
		else if(a>300&&a<=400) {
			float cc = a*1.2f;
			System.out.println("your bill amount is: "+cc);
		}
		else {
			float dd = a*2f;
			System.out.println("your bill amount is: "+dd);
			
			
		}

	}

}
