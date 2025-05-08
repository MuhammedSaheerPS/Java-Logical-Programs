import java.util.Scanner;
public class Pairs {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=scanner.nextInt();
		System.out.println("enter the size:");
		int size=scanner.nextInt();
		int[]array=new int[size];
		
		for(int i=0;i<array.length;i++) {
			System.out.println("enter the value:");
			array[i]=scanner.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			for(int j=i;j<array.length;j++) {
				if(array[i]+array[j]==n) {
					System.out.println("pairs: "+array[i]+","+array[j]);
				}
			}
		}
scanner.close();
	}

}
