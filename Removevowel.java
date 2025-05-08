import java.util.Scanner;
public class Removevowel {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the values:");
		String sb=scn.nextLine();
		String res="";
		for(int i=0;i<sb.length();i++) {
			char t=Character.toLowerCase(sb.charAt(i));
			if(t!='a'&&t!='e'&&t!='0'&&t!='i'&&t!='u') {
				res=res+sb.charAt(i);
			}
			
		}
		System.out.println(res);
	}

}
 