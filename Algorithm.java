//Mingrui Liu
//My algorithm is used to teach how to make a Scrambled Eggs with Tomatoes
public class Algorithm {

	public static void main(String[] args) {
		//Here is the steps to cook a Scrambled Eggs with Tomatoes
		//Below three String item what we need to prepare
		String Ingredients = " 3 eggs, 2 tomatoes";
		String Seasoning = " oil, salt, soy sauce";
		String Kitchenware = " knife, spatula, pot, chopping board and bowls";
		
		System.out.println("Prepare" + Ingredients + "," + Seasoning + "," + Kitchenware + ".");		//Prepare all we need
		System.out.println("Use water to clean tomatoes" + Kitchenware + ".");		//Make the tools clean
		
		ProcessingFood();
		CookingItem1("eggs", 1);
		CookingItem2("scrambled eggs and piece of tomatoes", 2);		//The sort of steps
		
		System.out.println("Now the Scrambled Eggs with Tomatoes is done, enjoy it!");		//The Ended
		
	}
	
	static void ProcessingFood() {		//First step to deal with Ingredients before cooking
		System.out.println("Use knife to cut tomatoes into pieces with middle size.");
		System.out.println("Put the cut tomatoes in a bowl.");
		System.out.println("Beat the eggs in a bowl.");
	}
	
	static void CookingItem1(String item, int time) {		//Cook eggs to make scrambled eggs
		System.out.println("Add oil in the pot, turn on the stove, put the " + item + " in the pot.");
		System.out.println("Use the spatula to cook " + time + " minutes.");
		System.out.println("Put item in a bowl and turn off the stove.");
	}
	
	static void CookingItem2(String item, int time) {		//Cook eggs and tomatoes together to finish the dish
		System.out.println("Add oil in the pot, turn on the stove, put the " + item + " in the pot.");
		System.out.println("Add appropriate amount of salt and soy sauce in the pot.");		//Add seasoning to make the dish delicious
		System.out.println("Use the spatula to cook " + time + " minutes.");
		System.out.println("Put item in a bowl and turn off the stove.");
	}
}
