import java.util.Scanner;
public class Split {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the sentence:");
		String s=scn.nextLine();
		String[]arr=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		scn.close();

	}

}
