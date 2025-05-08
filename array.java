
public class array {

	public static void main(String[] args) {
		int[] a = {1,4,5,3,2};
		int b=0;
		int c=0;
		for(int i=0;i<=4;i++) {
			b+=a[i];
			c=b/5;
			
		}
		System.out.println("sum is "+b);
		System.out.println("average is "+c);
	}

}
