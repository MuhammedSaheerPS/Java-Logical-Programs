import java.util.Scanner;
public class Removespace {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string:");
		String word=scanner.nextLine();
		String[]name=word.split(" ");
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]);
		}
		scanner.close();

	}

}
