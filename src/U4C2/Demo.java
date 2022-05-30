package U4C2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Student S = new Student();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of student object");
		int N = sc.nextInt();
		int store = 0;
		Student[] st = new Student[N];
		
		for(int i=0; i<st.length; i++) {
			
			System.out.println("Enter details of Student"+i+1);
			
			System.out.println("Enter roll");
			int roll = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter address");
			String address = sc.next();
			System.out.println("Enter marks");
			int marks = sc.nextInt();
			
			store+= marks;
			st[i] = new Student(roll,name,address,marks); 
			
			S.Details();
		
		}
		
		System.out.println("Average marks of all the students is: "+store);
		
		
	}

	
}
