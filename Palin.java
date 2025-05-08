import java.util.*;
public class Palin {
	static void palindrome(String name) {
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
			reverse+=name.charAt(i);
			
		}
		if (reverse.equalsIgnoreCase(name))System.out.println("its a palindrome");
		else System.out.println("its not a palindrome");
	}

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the name:");
	String name=scanner.nextLine();
	palindrome(name);
	

	}

}
