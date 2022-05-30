package U4C2;

import java.util.Scanner;

public class OLA {

	private int numberOfPassenger;
	private int numberOfKMs;

	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		this.numberOfPassenger = numberOfPassenger;
		this.numberOfKMs = numberOfKMs;
		
		if(numberOfPassenger<=3) {
			return new HatchBack();
		}
		else {
			
		}
		return new Sedan();
	}
	
	public int calculateBill(Car car) {
		return numberOfPassenger*numberOfKMs;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of passengers");
		int numberOfPassenger = sc.nextInt();
		System.out.println("Enter number of Kms");
		int numberOfKMs = sc.nextInt();
		
		OLA ola = new OLA();
		Car myCar = ola.bookCar(numberOfPassenger, numberOfKMs);
		int res = ola.calculateBill(myCar);
		
		System.out.println("The total fare amount is"+ res);
	}
}




