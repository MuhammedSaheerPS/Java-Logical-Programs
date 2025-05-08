import java.util.Scanner;
public class Compareto {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("emter the string 1:");
		String s1=scn.nextLine();
		System.out.println("enter the string 2:");
		String s2=scn.nextLine();
		if(s1.compareTo(s2)>0) {
			System.out.println(s1+" is the bigger");
		}
		else {
			System.out.println(s2+" is bigger");
		}
			
scn.close();
	}

}
