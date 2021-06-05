package indAsg2;

import java.util.Scanner; 
import java.text.DecimalFormat;

//2.4 Abstraction
public abstract class Employee{
	
	Scanner sc = new Scanner(System.in);
	
	protected static DecimalFormat df2 = new DecimalFormat("#.##");
	
	//declare variables
	protected String department, name;
	protected int employeeID;
	protected double salary;
	
	//default constructor
	//department, name, ID
	public Employee() { //constructor with no argument
		
		System.out.println("Please enter the details for Employee: ");
		
		//input the details for participant
		System.out.print("Department\t\t\t   : ");
		this.department = sc.nextLine();
		
		System.out.print("Employee ID\t\t\t   : ");
		this.employeeID = sc.nextInt();
		
		System.out.print("Employee Name\t\t\t   : ");
		this.name = sc.next();	
		
		System.out.print("Salary\t\t\t\t   : RM ");
		this.salary = sc.nextDouble();	

	}
	
	//2.3 Encapsulation
	//create getter method
	public String getDepartment() {
		return this.department;
	}
	
	public int getEmployeeID() {
		return this.employeeID;
	}
	
	public String getEmployeeName() {
		return this.name;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
	//2.2 Polymorphism
	//to print out employee details	
	public String toString() {
					
		return "\n=> Employee Details" + 
			   "\n============================================================" +
			   "\nDepartment\t\t\t   : " + this.department +
			   "\nEmployee ID\t\t\t   : " + this.employeeID +
			   "\nEmployee Name\t\t\t   : " + this.name +
			   "\nSalary\t\t\t\t   : RM " + df2.format(this.salary) +
			   "\n============================================================";
			
	}
}
