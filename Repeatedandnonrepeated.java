import java.util.Scanner;
public class Repeatedandnonrepeated {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string:");
		String word=scanner.nextLine();
		char[]array=word.toCharArray();
		char temp;
		for(int i=0;i<array.length;i++) {
			int count=0;
			temp=array[i];
			for(int j=i+1;j<array.length;j++) {
				if(temp==array[j]) {
					array[j]='#';
					count++;
				}
			}
		if(count>0 &&array[i]!='#') {
			System.out.println("repeated:"+temp);
		}
		else if (array[i]!='#'){
			System.out.println("non repeated word:"+temp);
		}
		
		}
		scanner.close();
	}

}
