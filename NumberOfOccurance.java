import java.util.*;
public class NumberOfOccurance {
	
	static int noc(int []num,int n) {
		int count=0;
		for (int i=0;i<num.length;i++) {
			if(num[i]==n)count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		for(int i=0;i<=10;i++) {
		int[]num= {1,4,5,6,2,3,7,8,9,5,6,4,4,2,6,5,8,9,9,8,7,4,5,6,1,2,3,6,5,4,7,8,8,9,8,7,4,5,6,2,2,5,8,9};
		System.out.println("enter the number:");
		int n=x.nextInt();
		System.out.println("the number of occurance of "+n+" is "+noc(num, n));
		
		
		}
		x.close();
	}

}
