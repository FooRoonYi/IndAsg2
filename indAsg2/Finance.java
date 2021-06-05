package indAsg2;

import java.util.Scanner;
import java.text.DecimalFormat;

//2.1 Inheritance
public class Finance extends Employee{
	
	Scanner sc = new Scanner(System.in);
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	//declare variables
	//income = total price
	private double employeeSalary, utilityFee, advertisementFee, prize, registrationFee;
	private int employeeQuantity, participantQuantity;
	
	//default constructor
	//total rent, total hours, total prize, no of participants, quantityOfEmployee, salaryPerHour
	public Finance() { //constructor with no argument
		super();
		System.out.println("\nPlease enter the details for Finance: ");
		
		System.out.print("Utility Fee budgeted\t\t   : RM ");
		this.utilityFee = sc.nextDouble();
		
		System.out.print("Advertisement Fee budgeted\t   : RM ");
		this.advertisementFee = sc.nextDouble();
		
		System.out.print("Prize budgeted\t\t\t   : RM ");
		this.prize = sc.nextDouble();
		
		System.out.print("\nEmployee Salary\t\t\t   : RM " + super.salary);
		
		System.out.print("\nQuantity of Employee\t\t   : ");
		this.employeeQuantity = sc.nextInt();
		
		System.out.print("\nRegistration Fee with no discount : RM ");
		this.registrationFee = sc.nextDouble();
		
		System.out.print("Quantity of Participant\t\t   : ");
		this.participantQuantity = sc.nextInt();
		
	}
	
	//2.3 Encapsulation
	//create getter methods (accessors)
	public double getUtilityFee() {
		return this.utilityFee;
	}
	
	public double getAdvertisement() {
		return this.advertisementFee;
	}
	
	public double getPrize() {
		return this.prize;
	}
	
	public double getEmployeeSalary() {
		return this.employeeSalary;
	}
	
	public int getEmployeeQuantity() {
		return this.employeeQuantity;
	}
	
	public double getRegistrationFee() {
		return this.registrationFee;
	}
	
	public int getParticipantQuantity() {
		return this.participantQuantity;
	}
	
	//calculate total salary needed to pay
	//employee salary * employee quantity
	public double totalSalary() {
		return super.getSalary() * this.employeeQuantity;
	}
	
	//calculate total income from customers
	//registration fee * participant quantity
	public double totalIncome() { 
		return this.registrationFee * this.participantQuantity;
	}
	
	//calculate total budget needed
	//total salary + utility fee + advertisement fee + prize
	public double totalBudget() {
		return (totalSalary() + this.utilityFee + this.advertisementFee + this.prize);
	}
	
	//calculate net profit which is get by bowling centre
	public double calcProfit() {
		
		if(totalIncome() > totalBudget())  //if income > budget, then get profit
			System.out.println("\nMessage: We are now gaining profit!");
		else
			System.out.println("\nMessage: We are now facing loss!");
		
		return totalIncome() - totalBudget();
		
	}
	
	//2.2 Polymorphism
	//to print out finance details
	public String toString() {
		
		return "\n=> Finance Details" +
			   "\n============================================================" +
			   "\nUtility Fee\t\t\t   : RM " + df2.format(this.utilityFee) +
			   "\nAdvertisement Fee\t\t   : RM " + df2.format(this.advertisementFee) + 
			   "\nPrize budgeted\t\t\t   : RM " + df2.format(this.prize) +
			   "\n\nEmployee Salary\t\t\t   : RM " + df2.format(super.salary) +
			   "\nQuantity of Employee\t\t   : " + this.employeeQuantity +
			   "\nTotal Salary\t\t\t   : RM " + df2.format(totalSalary()) +
			   "\n\nRegistration fee\t\t   : RM " + df2.format(this.registrationFee) +
			   "\nTotal Number of Participants\t   : " + this.participantQuantity +
			   "\nTotal Income\t\t\t   : RM " + df2.format(totalIncome()) +
			   "\n\nTotal Net Profit\t\t   : RM " + df2.format(calcProfit()) +
			   "\n============================================================";
		
	}

}
