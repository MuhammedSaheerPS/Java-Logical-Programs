import java.util.Scanner;
public class Stringtochar {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=scanner.nextLine();
		for(int i=0;i< s.length();i++) {
			char t=s.charAt(i);
			System.out.println(t);
			
		}
		}

	}

	