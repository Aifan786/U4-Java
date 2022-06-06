package U4C3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username");
		String name = sc.next();
		
		System.out.println("Enter password");
		String password = sc.next();
		
		System.out.println("Enter mobile number");
		String number = sc.next();
		
		System.out.println("Enter email");
		String email = sc.next();
		
		boolean nm = Pattern.matches("[a-zA-Z]{3,8}", name);
		boolean pswd = Pattern.matches("[a-zA-Z0-9]{3,8}", password);
		boolean nbr = Pattern.matches("[6789][0-9]{9}", number);
		
		if(nm==true && pswd==true && nbr==true) {
			
			Customer customer = new Customer();
			customer.setUsername(name);
			customer.setPassword(password);
			customer.setMobileNumber(number);
			customer.setEmail(email);
			
			System.out.println("Username is: "+customer.getUsername());
			System.out.println("Password is: "+customer.getPassword());
			System.out.println("Mobile number is: "+customer.getMobileNumber());
			System.out.println("Email is: "+customer.getEmail());
		}
		
		else {
			System.out.println("Invalid Credentials");
		}
	}
}
