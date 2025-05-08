
public class Occurance {

	public static void main(String[] args) {
		int []a= {1,2,1,3,1};
		int[]occurance=new int[10];
		for(int i=0;i<a.length;i++) {
			occurance[a[i]]++;
		}
		for(int i=0;i<occurance.length;i++) {
			if(occurance[i]>0) {
				System.out.println("occurance of "+i+" is:"+occurance[i]);
			}
		}
	}

}
