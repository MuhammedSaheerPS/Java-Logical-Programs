import java.util.Scanner;
public class Loertoupper {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value:");
		String a=scanner.nextLine();
		scanner.close();
		for(int i=0;i<a.length();i++) {
		char r=a.charAt(i);
		if(Character.isUpperCase(r)) {
			r=Character.toLowerCase(r);
			}
		else {
			r=Character.toUpperCase(r);
			}
		System.out.print(r);
			
		
		
		
		}

	}

}
