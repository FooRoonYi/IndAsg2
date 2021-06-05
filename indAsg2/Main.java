package indAsg2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Bowling Event!");
		
		System.out.println();
		
		System.out.println("Select yours to enter the page for registration.");
		System.out.println("1. Participant \n2. Employee \n3. Marketing");
		System.out.print("\nSelect\t\t\t\t   : ");
		int option = sc.nextInt();
		
		System.out.println();
		
		switch(option) {
		
			case 1: 
				Participant p = new Participant("Time Zone Bowling Centre", "Skudai", "012-3456789");
				System.out.println(p.toString()); 
				switch(p.eventName){
				case 1: 
					p.printDuckPinInfo(); 
					break; //case 1 end
				case 2: 
					p.print5PinInfo(); 
					break; //case 2 end
				case 3: 
					p.printCandlepinInfo();
					break; //case 3 end
				default: 
					System.out.println("Invalid input!\nPlease type again.");
					System.exit(0); //default end
				} 
				break;//case 1 ends
			
			case 2: 
				Finance f = new Finance();
				System.out.println(f.toString()); 
				break; //case 2 ends
			
			case 3: 
				Marketing m = new Marketing("Time Zone Bowling Centre", "Skudai", "012-3456789", 500, "Saturday", 29.99);
				System.out.println(m.toString());
				m.printAdvertisement();
				break; //case 3 ends
			
			default: 
				System.out.println("Invalid input!\nPlease type again.");
				System.exit(0); //default ends
		}
		
	}
}
