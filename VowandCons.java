import java.util.Scanner;

public class VowandCons {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the values:");
		String sb=scn.nextLine();
		int vowels=0;
		int conso=0;
		for(int i=0;i<sb.length();i++) {
			char t=Character.toLowerCase(sb.charAt(i));
			if(t=='a'||t=='e'||t=='o'||t=='i'||t=='u') {
				vowels++;
				}
			else {
				conso++;
			}
		}
		System.out.println(vowels+" vowels");
			
		System.out.println(conso+" consonant");
	}

}