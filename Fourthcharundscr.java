import java.util.Scanner;
public class Fourthcharundscr {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value:");
		String a=scanner.nextLine();
		scanner.close();
		for (int i=0;i<a.length();i++) {
			if((i+1)%4==0) {
				System.out.print("_");
				i++;
			}
			System.out.print(a.charAt(i));
		}
		
	
//		String[]words=a.split("");
//		for(int i=0;i<words.length;i++) {
//			if((i+1)%4==0) {
//				words[i]="_";
//				
//			}
//		}
//			String result=String.join("", words);
//			System.out.println(result);
			}
		}

	


//import java.util.Scanner;
//public class Uppertolower {
//
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter the value:");
//		String a=scanner.nextLine();
//		scanner.close();
//		for(int i=0;i<a.length();i++) {
//			
//		}
//
//	}
//
//}
