package indAsg2;

//total price for WEEK DAY
class PriceRate implements TotalPayment{ //implements the interface totalpayment
	
	double rf = 29.99; //registration fee = 29.99 per person
	
	//calculate total price with no disc
	public double totalPrice() {
		return rf;
	}
	
	//calculate total price with discount
	public double totalPrice(double disc) {
		return rf * (1-disc);
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
	
}
