import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the String:");
		String word=scn.nextLine();
		String rev="";
		for(int i=word.length()-1;i>=0;i--) {
			rev+=word.charAt(i);
			
		}
		if(word.equalsIgnoreCase(rev))System.out.println("its a palindrome!!");
		else System.out.println("its not a palindrome!!!");

		}
	}



