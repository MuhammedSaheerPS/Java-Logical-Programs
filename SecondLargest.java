import java.util.*;
public class SecondLargest {
	static void sec(int [ ]num ) {
		Arrays.sort(num);
		int seclarge=num.length-2;
		System.out.println(num[seclarge]);
	}

	public static void main(String[] args) {
		int [] num= {7,8,9,4,5,6,1,3,2};
		sec(num);

	}

}
