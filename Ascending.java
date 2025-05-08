
public class Ascending {

	public static void main(String[] args) {
		int[]a= {8,9,3,6,2,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		

	}

}
