
package U4C2;

public class Person {

	 private String name;
	 private String gender;
	 private Address address;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
	  
}

class Address{
	private String city;
	private String state;
	String pincode;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	

}

class Instructor extends Person{
	
	int instructorId;
	int salary;
	
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary +  
			     ", Address=" + getAddress().toString()+ "]";
	}
	
	
}

class Student extends Person{
	
	int studentId;
	String courseEnrolled;
	int courseFee;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCourseEnrolled() {
		return courseEnrolled;
	}
	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ ", Name=" + getName() + ", Gender=" + getGender() + " ," + getAddress().toString() 
				+ "]";
	}
	
	
}


 
 
 
 
 
 
 