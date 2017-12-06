package creational_fasbp.builderPattern;

public class MealBuilderDemoMain {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal beafBurger = mealBuilder.prepareBeafiBurgerMeal();
		System.out.println("\nBeaf Burger Meal:");
		beafBurger.showItems();
		System.out.println("Total Cost: " + beafBurger.getCost());

		Meal chickenBurger = mealBuilder.prepareBeafiBurgerMeal();
		System.out.println("\nChicken Burger Meal:");
		chickenBurger.showItems();
		System.out.println("Total Cost: " + chickenBurger.getCost());

		Meal vegiBurger = mealBuilder.prepareVegiBurgerMeal();
		System.out.println("\nVegi Burger Meal:");
		vegiBurger.showItems();
		System.out.println("Total Cost: " + vegiBurger.getCost());


	}

}
