import java.util.Scanner;
public class Stringuppercase {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=scanner.nextLine();
		char r=Character.toUpperCase(s.charAt(0));
		String r1="";
		r1=r1+r;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i-1)==' ') {
				r1+= Character.toUpperCase(s.charAt(i));
				
			}
			else
				r1+=s.charAt(i);
			
		}
        System.out.println(r1);
	}

} 
