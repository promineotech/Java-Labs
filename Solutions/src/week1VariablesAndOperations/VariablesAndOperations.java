package week1VariablesAndOperations;

public class VariablesAndOperations {

	public static void main(String[] args) {
		
		//create a variable to hold the quantity of available plane seats left on a flight
		int availablePlaneSeats = 6;
		
		//create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 23.64;
		
		//create a variable to hold a person's middle initial
		char middleInitial = 'G';
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isHotOutside = false;
		
		//create a variable to hold a customer's first name
		String customerFirstName = "Sally";
		
		//create a variable to hold a street address
		String streetAddress = "1234 W Easy St";
		
		//print all variables to the console
		System.out.println("Available seats left on the plane: " + availablePlaneSeats);
		System.out.println(costOfGroceries + " is the price for groceries.");
		System.out.println("The person's middle initial is " + middleInitial);
		System.out.println("It is hot outside - " + isHotOutside);
		System.out.println("The customer's first name is " + customerFirstName);
		System.out.println(streetAddress + " is where the person lives.");
		
		
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		availablePlaneSeats = availablePlaneSeats - 2;
		availablePlaneSeats -= 2;
		System.out.println(availablePlaneSeats);
		
		//impulse candy bar purchase, add 2.15 to the grocery total
		//costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		
		//birth certificate was printed incorrectly, change the middle initial to something else
		middleInitial = 'C';
		System.out.println(middleInitial);
		
		//the season has changed, update the hot outside variable to be opposite of what it was
		isHotOutside = !isHotOutside;
		System.out.println(isHotOutside);
		
		//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
		String fullName = customerFirstName + " " + middleInitial + " Smith";
		System.out.println(fullName);
		
		//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("Hi, my name is " + fullName + " and I live at " + streetAddress + ".");

	}

}
