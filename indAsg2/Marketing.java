package indAsg2;

import java.util.Scanner;
import java.text.DecimalFormat;

//2.1 Inheritance
public class Marketing extends BowlingCentre implements TotalPayment{ //implement interface total payment
	
	Scanner sc = new Scanner(System.in);
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	//declare variables
	protected int prize;
	protected String day;
	protected double registrationFee;
	
	public Marketing(String n, String l, String c, int pr, String d, double rf) { //constructor with six argument
		super(n, l, c);
		this.prize = pr;
		this.day = d;
		this.registrationFee = rf;
		
		System.out.println("The details in Marketing are: ");
		System.out.println("Prize\t\t\t\t   : RM " + pr);
		System.out.println("\nDay\t\t\t\t   : " + d);
		System.out.println("Registration fee before discount   : RM " + rf);
		
		//call totalPrice
		TotalPayment wdp = new PriceRate();
		
		if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
			System.out.println("There is no discount on that day!"); //other from Sun or Sat have no disc
		}
		else if(day.equals("Sunday") || day.equals("Saturday")) { //only Sun or Sat have no disc
			Discount dd = new WeekDayDiscount();
			double disc = dd.discountRate();
			System.out.println("\nDiscount\t\t\t   : " + disc);
			System.out.println("Registration fee after discount    : RM " + df2.format( wdp.totalPrice(d, disc)));
		}
		
	}
	
	//calculate total price with no disc
	public double totalPrice() { //method with no argument
		return this.registrationFee;
	}
		
	//calculate total price with discount
	public double totalPrice(double disc) { //method with one argument
		return this.registrationFee * (1-disc);
	}
		
	//calculate total price with weekday and discount
	public double totalPrice(String d, double disc) { //method with two arguments
			
		if(d.equals("Sunday") || d.equals("Saturday")) { //if it is Sun/Sat, then disc = 0.15
			return totalPrice(0.15);
		}
		else { //instead of Sun/Sat, no disc
			System.out.println("There is no discount on that day!");
		}
			
		return totalPrice(0.15);
		
	}
		
	//print out advertisement
	public void printAdvertisement() {
		
		TotalPayment wdp = new PriceRate();
		
		System.out.println("Contact " + super.contact + " for registration now to join bowling event in " + super.nameCentre + " !");
		System.out.println("Registration fee is lowest at RM " + df2.format(wdp.totalPrice(0.15)) + " now!");
		System.out.println("The prizes given are up to RM " + this.prize + " to the highest mark team!");
		System.out.println("And, there is 15% discount provided to the team registered during weekend!");
		System.out.println("Let's bowling now ~~!");
		
	}
	
	//2.2 Polymorphism
	//to print out marketing details
	//print out prize, advertisement, registration fee
	public String toString() {
		
		return "\n=> Marketing Details" +
			   "\n============================================================" +
			   "\nPrize\t\t\t\t   : RM " + this.prize +
			   "\nDay\t\t\t\t   : " + this.day +
			   "\nRegistration Fee before discount   : RM " + this.registrationFee +
			   "\n============================================================";
		
	}

}
