import java.util.Scanner;
public class Sumoddeven {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size: ");
		int size=scanner.nextInt();
		int[]a=new int[size];
		int evensum=0;
		int oddsum=0;
		
		for (int i=0;i<a.length;i++) {
			System.out.println("enter the value: ");
			a[i]=scanner.nextInt();		
		}
		System.out.print("array is: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evensum+=a[i];
				
			}
			else {
				oddsum+=a[i];
			}
		}
		System.out.println("sum of even: "+evensum);
		System.out.println("sum of odd: "+oddsum);
		scanner.close();
		

	}
	

}
