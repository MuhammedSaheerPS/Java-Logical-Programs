import java.util.Scanner;
public class Movezero {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size: ");
		int size=scanner.nextInt();
		int[]a=new int[size];
		int front=0;
		for(int i=0;i<a.length;i++) {
			System.out.println(" enter the array: ");
			a[i]=scanner.nextInt();
		}
		System.out.print("entered array: ");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[front]=a[i];
				front++;
			}
		}
		for(int i=front;i<a.length;i++) {
			a[i]=0;
		}
		System.out.print("moved array: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		scanner.close();
		}

	}


