package indAsg2;

class WeekDayDiscount implements Discount{

	public double discountRate() { //same method as in discountRate
		return 0.15; //with body
	}
	
}

class ParticipantDiscount implements Discount{
	
	public double discountRate() { //same method as in discountRate
		return 0.10; //with body
	}
}
