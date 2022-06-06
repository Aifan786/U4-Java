package Practice1;

public class Person {

	String nameString;
	String genderString;
	
	public Person(String name, String gender) {
		this.nameString = name;
		this.genderString = gender;
	}
	
	class Address{
		String city;
		String state;
		String pincode;
		
		public Address(String city, String state, String pincode) {
			this.city = city;
			this.state = state; 
			this.pincode = pincode;
		}

		@Override
		public String toString() {
			return "Address [cityString=" + city + ", stateString=" + state + ", pincode=" + pincode + "]";
		}
		
	}
}

class Instructor extends Person{
	
	
	
	@Override
	public String toString() {
		return "Instructor [address=" + address + ", instructorId=" + instructorId + ", salary=" + salary + "]";
	}

	Address address = new Address("Bengaluru", "Karnataka", "56643");
	
	int instructorId;
	int salary;
	
	public Instructor(int InsId, int salary) {
		super("Sita","Female");
		this.instructorId = InsId;
		this.salary = salary;
	}
}

class Student extends Person{
	
	

	@Override
	public String toString() {
		return "Student [address=" + address + ", studentId=" + studentId + ", courseEnrolled=" + courseEnrolled
				+ ", courseFee=" + courseFee + "]";
	}

	Address address = new Address("Hyderabad", "Telangana", "85748");
	
	int studentId;
	String courseEnrolled;
	int courseFee;
	
	public Student(int sId, String course, int cFee) {
		super("Rohan","Male");
		this.studentId = sId;
		this.courseEnrolled = course;
		this.courseFee = cFee;
		
	}
	
}




