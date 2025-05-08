
public class Alterneg {

	public static void main(String[] args) {
		int[]a= {5,9,1,3,7,4,5};
		for (int i=0;i<a.length;i++) {
			if(i%2!=0) {
				System.out.print("-");
			}
			System.out.print(a[i]+" ");
		}

	}

}
