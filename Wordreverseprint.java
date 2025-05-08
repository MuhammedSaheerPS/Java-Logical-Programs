import java.util.Scanner;
public class Wordreverseprint {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string:");
		String word=scanner.nextLine();
		String[]array=word.split(" ");
		for(int i=0;i<array.length;i++) {
			char[]reverse=array[i].toCharArray();
			for(int j=reverse.length-1;j>=0;j--) {
				System.out.print(reverse[j]);
			}
			System.out.print(" ");
		}
		scanner.close();

	}

}
