package week5ObjectOrientedProgramming;


public class OOPPrompts {
	
	public static void main(String[] args) {
		
		//create a class called Person with fields firstName, lastName, and age. Make sure any age assigned must be valid (i.e. non negative and < 120)
		
		//create 2 different instances of person with different values for the fields.
		
		//create and test a method that takes a two Persons and returns the firstName of the Person who is older.
		
		//create a class called Card to represent a standard playing card. It should have a name field, suit field, and a value field for comparing against other cards.
		
		//create a class called Deck. This class should have a list field called cards that holds all the cards in the deck. In the constructor, instantiate all 52
		//standard playing cards and add them to the cards list.
		
		//add a shuffle method to Deck
		
		//add a draw method to Deck
		
		//create and test a method that takes an int as a parameter (representing the number of players for a game) and returns a Map<String, List<Card>>
		//that represents each player (i.e. "Player 1", "Player 2", etc..) and their cards.
		//the method should create a new instance of Deck, shuffle it, and deal the cards out to the "players" in the Map.
		
		/*
		 *Create the following four classes: VendingMaching, ItemSlot, Item, and Return
		 *VendingMaching will contain a Map<String, ItemSlot> where the String will represent the location in the vending machine (i.e. "A4") and the ItemSlot
		 *will contain an item, the item's price, and the quantity of that item in that slot
		 *The Item will contain a description
		 *Return will have a field for an Item and a double for any change. The Return is what will be returned to each user using the vending machine.
		 *
		 *VendingMachine should have a method that takes a double (money) and a location (i.e. "A4") and return a Return containing any change and the item.
		 *If the supplied money was insufficient to purchase the item, the Return should contain just the money (item should be null).
		 *
		 *VendingMachine should also have a method that takes an Item, int (quantity), and string (location) and will create an ItemSlot based on the input.
		 */
		
		//create an Interface called MathOperation with a method called evaluate that takes two doubles and returns a double.
		//create four implementing classes AdditionOperation, SubtractionOperation, MultiplicationOperation, and DivisionOperation
		//create a method that takes a MathOperation and two doubles and returns the result of calling the evaluate method on the MathOperation with the two doubles
		
	}

}
