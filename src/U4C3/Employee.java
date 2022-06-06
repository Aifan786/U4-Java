package U4C3;

public abstract class Employee {

	protected int employeeId;
	protected String employeeName;
	protected double salary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	
	abstract void calculateSalary();
	
	
}

class PermanentEmployee extends Employee{


	private double basicPay;
	
	public PermanentEmployee(int employeeId, String employeeName, double salary, double basicPay) {
		super(employeeId, employeeName, salary);
		this.basicPay = basicPay;
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		salary = basicPay-(basicPay*0.12);
	}
	
	
}

class TemporaryEmployee extends Employee{
	
	int hoursWorked;
	int hourlyWages;

	public TemporaryEmployee(int employeeId, String employeeName, double salary, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName, salary);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}



	@Override
	void calculateSalary() {
		
		salary = hoursWorked*hourlyWages;
	}
	
	
}













