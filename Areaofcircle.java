import java.util.Scanner;
public class Areaofcircle {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the value of R");
		int rad=scn.nextInt();
		scn.close();
		float pi=3.14f;
		float are=pi*(rad*rad);
		System.out.println("the area of circle is: "+are);
	}

}
