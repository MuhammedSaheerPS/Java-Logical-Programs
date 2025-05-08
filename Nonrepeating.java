
public class Nonrepeating {

	public static void main(String[] args) {
		int []a= {2,6,3,2,5,6};
		int c=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
			if(i==j) {
				continue;
			}
			if(a[i]==a[j] ){
				c++;
			}
		}
			if(c==0) {
				System.out.println("non reporting of:"+a[i]);
			}
			c=0;
		}

	}

}
