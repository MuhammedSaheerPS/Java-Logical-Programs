import java.util.*;
public class BinarySearchProg {
	static int binarySearch(int[]num,int numberToFind) {
		int low=0;
		int high=num.length-1;
		while(low<=high) {
			int middlePosition=(low+high)/2;
			int middleNumber=num[middlePosition];
			if(numberToFind==middleNumber)return middlePosition;
			if(numberToFind<middleNumber)high=middlePosition-1;
			else low=middlePosition+1;
		}
		return -1;
	}
	static int normalMethod(int[]num,int numberToFind) {
		for(int i=0;i<num.length;i++) {
			if(numberToFind==num[i])return i;
			
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int []num= {1,2,3,4,5,8,9,7,6};
		System.out.println("enter the value:");
		int n=scanner.nextInt();
		System.out.println("index is:"+binarySearch(num,n));
		System.out.println("index is:"+normalMethod(num,n));

	}

}
