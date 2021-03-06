package U4C3;

import java.util.Scanner;

public class Demo {

	void showDetails(Month m) {
		
		switch (m) {
			case JAN:
				System.out.println("This is the 1st Month of the Year January");
				break;
			case FEB:
				System.out.println("This is the 2nd Month of the Year February");
				break;
			case MAR:
				System.out.println("This is the 3rd Month of the Year March");
			case APR:
				System.out.println("This is the 4th Month of the Year April");
				break;
			case MAY:
				System.out.println("This is the 5th Month of the Year May");
				break;
			case JUN:
				System.out.println("This is the 6th Month of the Year June");
				break;
			case JUL:
				System.out.println("This is the 7th Month of the Year July");
				break;
			case AUG:
				System.out.println("This is the 8th Month of the Year August");
				break;
			case SEP:
				System.out.println("This is the 9th Month of the Year September");
				break;
			case OCT:
				System.out.println("This is the 10th Month of the Year October");
				break;
			case NOV:
				System.out.println("This is the 11th Month of the Year November");
				break;
			case DEC:
				System.out.println("This is the 12th Month of the Year December");
				break;
		}
	}
	
	public static void main(String[] args) {
			
		try {
			Scanner sc =  new Scanner(System.in);
			System.out.println("Enter a month name");
			String month_name = sc.next();
			
	        Month month	= Month.valueOf(month_name);	
     			
			Demo demo = new Demo();
		    demo.showDetails(month);
		} 
		
		catch (Exception e) {
			System.out.println("Invalid Month Name");
		}
		
		
	}
}
