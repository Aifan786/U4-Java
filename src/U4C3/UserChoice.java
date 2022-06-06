package U4C3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserChoice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
	    int size = sc.nextInt();
	    
	    try {
			int[] arr = new int[size];
			for(int i=0; i<arr.length; i++) {
				System.out.println("Enter a number");
				int num = sc.nextInt();
				arr[i] =  num;
			}
			System.out.println("Enter the index of the array element you want to access");
			int index = sc.nextInt();
			
			System.out.println("The array element at index 1 ="+" "+arr[index]);
			System.out.println("The array element successfully accessed");
	    	
		} 
	    catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
	    catch (InputMismatchException e) {
			System.out.println("java.lang.NumberFormatException");
		}
	}
}
