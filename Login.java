import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the username :");
		String username =scanner.nextLine();
		
		String user="akash";
		String pass="javasurya";
		if (username.equals(user)) {
			System.out.println("Enter the password :");
			String password =scanner.next();
			if (password.equals(pass)) {
				System.out.println("welcome java");
				
			}
			else {
				System.out.println("Invalid password");
			}
			
		}
		else {
			System.out.println("Invalid username");
		}
		
scanner.close();
	}	
}

