import java.util.Scanner;
public class Inputarr {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int n=scanner.nextInt();
		int[]a=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the value: ");
			a[i]=scanner.nextInt();
		} 
		for(int i=0;i<a.length;i++) {
			if (a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		scanner.close();
	}

}
