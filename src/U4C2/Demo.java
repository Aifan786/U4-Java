package U4C2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

//		Students s = new Students();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of student object");
		int N = sc.nextInt();
		int store = 0;
		Students[] st = new Students[N];
		
		for(int i=0; i<st.length; i++) {
			
			System.out.println("Enter details of Student"+i+1);
			
			System.out.println("Enter roll");
			int r = sc.nextInt();
			System.out.println("Enter name");
			String n = sc.next();
			System.out.println("Enter address");
			String ad = sc.next();
			System.out.println("Enter marks");
			int ms = sc.nextInt();
			
			store+= ms;
			 
			st[i] = new Students(r,n,ad,ms);
//			s.display(r,n,ad,ms);
		
		}
		int i = 1;
		for(Students student: st) {
			System.out.println("Student "+i+" details");
			i++;
			student.details();
			
		}
		
		System.out.println("Average marks of all the students is: "+store);
		
		
	}

}







