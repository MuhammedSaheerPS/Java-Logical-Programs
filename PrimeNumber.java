import java.util.*;
public class PrimeNumber {
	static boolean Prime(int num) {
		int count=0;
		if(num<2) {
			return true;
		}
		for(int i=1;i<=num;i++) {
			if(i%num==0)count++;
		}
		if(count==2)return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=scanner.nextInt();
		if(Prime(n)) System.out.println("its prime");
		else System.out.println("its not prime");

	}

}
