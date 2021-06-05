package indAsg2;

import java.util.Scanner;
import java.text.DecimalFormat;

//2.1 Inheritance
public class Participant extends EventDetails implements TotalPayment{
	
	Scanner sc = new Scanner(System.in);
	
	protected static DecimalFormat df2 = new DecimalFormat("#.##");
	
	//declare variables
	protected String name, tName, gender;
	protected int age, noOfParticipants;
	
	//default constructor
	//participants name, gender, age, no of participants, team name
	public Participant(String n, String l, String c) { //constructor with no argument
		super(n, l, c);
		System.out.println("\nPlease enter the details for Participant: ");
		
		//input details for participants 
		System.out.print("Participant Name\t\t   : ");
		this.name = sc.nextLine();
		
		System.out.print("Gender (M for Male / F for Female) : ");
		this.gender = sc.nextLine();
		
		System.out.print("Age\t\t\t\t   : ");
		this.age = sc.nextInt();
		
		System.out.print("Number of participants in a team   : ");
		this.noOfParticipants = sc.nextInt();
		
		System.out.print("Team Name\t\t\t   : ");
		this.tName = sc.next(); 
		
		System.out.println("\nRegistration Fee\t\t   : RM " + super.registrationFee);
		
		TotalPayment w = new PriceRate(); 
		
		if(this.noOfParticipants == 4 || this.noOfParticipants < 4) { //noOfParticipant = 4 or < 4, there is no discount for it
			double tPrice1 = w.totalPrice() * this.noOfParticipants; //registration fee * no of participants
			System.out.println("Since there are " + this.noOfParticipants + " participants, then you have to pay RM " + df2.format(tPrice1) + ".");
		} else { //noOfParticipant > 4, there is discount for it
			Discount d = new ParticipantDiscount();
			double disc = d.discountRate();
			double tPrice2 = w.totalPrice(disc) * this.noOfParticipants; //registration fee * no of participants * (1-disc)
			System.out.println("Discount\t\t\t   : " + disc);
			System.out.println("Since there are " + this.noOfParticipants + " participants, then you have to pay RM " + df2.format(tPrice2) + ".");
		} 
	
	}
	
	//2.3 Encapsulation
	//create getter method
	public String getParticipantName() {
		return this.name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getNoOfParticipants() {
		return this.noOfParticipants;
	}
	
	public String getTeamName() {
		return this.tName;
	}
	
	//calculate total price with no disc
	public double totalPrice() {
		return super.registrationFee;
	}
		
	//calculate total price with discount
	public double totalPrice(double disc) {
		return super.registrationFee * (1-disc);
	}
		
	//calculate total price with weekday
	public double totalPrice(String d, double disc) {
			
		if(d.equals("Sunday") || d.equals("Saturday")) { //if it is Sun/Sat, then disc = 0.15
			return totalPrice(0.15);
		}
		else { //instead of Sun/Sat, no disc
			System.out.println("There is no discount on that day!");
		}
			
		return totalPrice(0.15);
		
	}
		
	//2.2 Polymorphism
	//to print out participant details
	//participant can be individual or team
	//print out registered participant's name, gender, team name, noOfParcipants in a team
	public String toString() {
					
		return "\n=> Participant Details" +
			   "\n============================================================" +
			   "\nParticpant Name\t\t\t   : " + this.name +
			   "\nGender (M for Male / F for Female) : " + this.gender +
			   "\nAge\t\t\t\t   : " + this.age +
			   "\nNumber of participants in a team   : " + this.noOfParticipants +
			   "\nTeam Name\t\t\t   : " + this.tName +
			   "\nRegistration Fee\t\t   : RM " + super.registrationFee + " per person" +
		   	   "\n============================================================";
			
	}
	
}
