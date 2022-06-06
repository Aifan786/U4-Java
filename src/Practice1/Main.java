package Practice1;

public class Main {

	public static Person generatePerson(Person person) {
		return person;
	}
	
	public static void main(String[] args) {
		
		Person newStudent = generatePerson(new Student(213,"Java111", 300000));
		Person newTeacher = generatePerson(new Instructor(630,90000));
		
		System.out.println(newStudent);
		System.out.println(newTeacher);
	}
}
