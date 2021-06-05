package indAsg2;

import java.util.Scanner;

//2.4 Abstraction
public abstract class BowlingCentre {
	
	Scanner sc = new Scanner(System.in);
	
	protected String nameCentre, location, contact;
	
	public BowlingCentre(String n, String l, String c) { //constructor with three arguments
		
		this.nameCentre = n;
		this.location = l;
		this.contact = c;
		
		System.out.println("Bowling Centre Name\t\t   : " + n);
		System.out.println("Location\t\t\t   : " + l);
		System.out.println("Contact\t\t\t\t   : " + c);
		System.out.println();
	}
	
}
