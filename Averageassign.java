import java.util.Scanner;
public class Averageassign {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter mark of maths:");
		int math=scn.nextInt();
		System.out.println("Enter mark of science:");
		int scie=scn.nextInt();
		System.out.println("Enter mark of cs:");
		int cs=scn.nextInt();
		scn.close();
		int tot= math+scie+cs;
		int avg=tot/3;
		System.out.println("total mark is: "+tot);
		System.out.println("the average of marks is: "+avg);

	}

}
