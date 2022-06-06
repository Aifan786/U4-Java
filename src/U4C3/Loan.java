package U4C3;

public class Loan {

	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee) {
			employeeObj.salary = 15/100*employeeObj.salary;
			PermanentEmployee permanentEmployee =
			new PermanentEmployee(employeeObj.employeeId, employeeObj.employeeName, employeeObj.salary, 5000);
			
		}
		return 0;
		
	}
}
