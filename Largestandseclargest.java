
public class Largestandseclargest {

	public static void main(String[] args) {
		int[]a= {8,9,9,3,6,2,4};
		int first;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		first=a[0];
		System.out.println("first largest number:"+first);
		for(int i=1;i<a.length;i++) {
			if(a[i]<first) {
				System.out.println("second largest number:"+a[i]);
				break;
			}
		}
		
}
}
