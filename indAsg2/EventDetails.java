package indAsg2;

import java.util.Scanner;

//2.1 Inheritance
//2.4 Abstraction
public abstract class EventDetails extends BowlingCentre{
	
	Scanner sc = new Scanner(System.in);
	
	protected String contact;
	protected int eventName, category;
	protected double registrationFee;
	
	public EventDetails(String n, String l, String c) { //constructor with no argument
		super(n, l, c);
		System.out.println("Choose the event that you participated: ");
		System.out.println("1. Duck Pin Bowling\n2. 5-Pin Bowling\n3. Candlepin Bowling");
		System.out.print("Type of Event\t\t\t   : ");
		this.eventName = sc.nextInt();
		
		System.out.println("\nChoose the category: \n1. 10-pin \n2. 5-Pin");
		System.out.print("Category\t\t\t   : ");
		this.category = sc.nextInt();
		
		System.out.print("\nRegistration Fee\t\t   : RM ");
		this.registrationFee = sc.nextDouble();
		
	}
	
	//2.3 Encapsulation
	//create getter methods (accessors)
	public int getEventName() {
		return this.eventName;
	}
	
	public int getCategory() {
		return this.category;
	}
	
	public double getRegistrationFee() {
		return this.registrationFee;
	}
	
	//2.2 Polymorphism
	//print duck pin info (10-pin)
	public void printDuckPinInfo() {
		System.out.println("Hey there! Here comes the rules...");
		System.out.println("1. A game consists of 10 frames.  \n   Each box on the score sheet represents one frame.");
		System.out.println("2. Maximum number of balls rolled in each frame is three.");
		System.out.println("3. Add each frame’s score to the previous one so that the game score progressively increases.");
		System.out.println("4. If all ten pins are knocked down by the first ball in any frame, \n   1it is called a 'Strike' and is usually symbolised on the score sheet with an X.");
		System.out.println("5. The maximum score is 300.");
	}
	
	//2.2 Polymorphism
	//print 5 pin info (5-pin)
	public void print5PinInfo() {
		System.out.println("Hey there! Here comes the rules...");
		System.out.println("1. In each frame, each player gets three attempts to knock all five pins over.");
		System.out.println("2. Knocking all five pins down with the first ball is a strike, worth 15 points.");
		System.out.println("3. If a bowler manages to clear the pins with the first ball, then this is a 'strike'.");
		System.out.println("4. If a bowler succeeds upon his second attempt, then this is a 'spare'.");
		System.out.println("5. The maximum score is 450.");
	}
	
	//2.2 Polymorphism
	//print candle pin info (10-pin)
	public void printCandlepinInfo() {
		System.out.println("Hey there! Here comes the rules...");
		System.out.println("1. Each player gets three rolls per turn.");
		System.out.println("2. This is scored by bowling 12 strikes: one in each box, and a strike with both bonus balls in the 10th box.");
		System.out.println("3. Candlepins are thinner (hence the name \"candlepin\"), and thus harder to knock down.");
		System.out.println("4. The candlepin pinsetter is triggered manually with a reset button after each frame rather than automatically.");
		System.out.println("5. The maximum score is 300.");
	}
	
	//2.2 Polymorphism
	//to print out event details
	//print out registered participant's name, gender, team name, noOfParcipants in a team
	public String toString() {
						
		 return "\n=> Event Details" +
			 	"\n============================================================" +
			 	"\nType of Event\t\t\t   : " + this.eventName +
			 	"\nCategory\t\t\t   : " + this.category +
			 	"\nBowling Event Venue\t\t   : " + super.location +
			 	"\nContact\t\t\t\t   : " + super.contact +
			 	"\nRegistration Fee\t\t   : RM " + this.registrationFee +
			 	"\n============================================================";
				
	}
}
