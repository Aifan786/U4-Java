
package U4C2;

public class Main {

	public static Person generatePerson(Person person) {
		
		if(person instanceof Student) {
			Student student = (Student)person;
			student.setStudentId(2);
			student.setCourseFee(300000);
			student.setCourseEnrolled("Java");
			student.setName("Rohan");
			student.setGender("Male");
			student.setAddress(new Address());
			student.getAddress().pincode="67770";
			student.getAddress().setCity("Ranchi");
			student.getAddress().setState("Jharkhand");
			
			return student;
		}
		else {
			Instructor instructor  = (Instructor)person;
			instructor.setInstructorId(121);
			instructor.setSalary(80000);
			instructor.setAddress(new Address());
			instructor.getAddress().pincode="876656";
			instructor.getAddress().setCity("Bangalore");
			instructor.getAddress().setState("Karnataka");
			
			return instructor;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Person newStudent = generatePerson(new Student());
		System.out.println(newStudent);
		
		Person newTeacher = generatePerson(new Instructor());
		System.out.println(newTeacher);
	   
	}
}







