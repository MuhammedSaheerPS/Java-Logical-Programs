public class J3pt2 {
	public static void main(String[] args) {

		for (int i=1;i<=50;i++) {
			if (i%3==0) {
			System.out.println("accord");
			}
			else if (i%5==0) {
				System.out.println("infomatrix");
			}
			else if (i%3==0&&i%5==0) {
				
				System.out.println("accord infomatrix");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
			
	


