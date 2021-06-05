package indAsg2;

class WeekDayDiscount implements Discount{ //implements interface discount

	public double discountRate() { //same method as in discountRate
		return 0.15; //with body
	}
	
}

class ParticipantDiscount implements Discount{ //implements interface discount
	
	public double discountRate() { //same method as in discountRate
		return 0.10; //with body
	}
	
}
