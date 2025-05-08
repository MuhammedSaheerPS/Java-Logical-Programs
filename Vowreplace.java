import java.util.Scanner;
public class Vowreplace{

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the values:");
		String sb=scn.nextLine();
		
		for(int i=0;i<sb.length();i++) {
			char t=Character.toLowerCase(sb.charAt(i));
			if(t=='a'||t=='e'||t=='o'||t=='i'||t=='u') {
			System.out.print(t='#');
			
				}
			System.out.print(t);
			
				}
		
	}

}
 

//import java.util.Scanner;
//public class Vowreplace{
//
//	public static void main(String[] args) {
//		Scanner scn=new Scanner(System.in);
//		System.out.println("enter the values:");
//		String sb=scn.nextLine();
//		
//		for(int i=0;i<sb.length();i++) {
//			char t=Character.toLowerCase(sb.charAt(i));
//			if(t=='a'||t=='e'||t=='o'||t=='i'||t=='u') {
//			System.out.print(t='#');
//			
//				}
//			
//			System.out.print(t);
//				}
//		
//	}