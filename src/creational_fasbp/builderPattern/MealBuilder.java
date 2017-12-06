package creational_fasbp.builderPattern;

public class MealBuilder {

	/**
	 * @author HossaiM
	 * <br>
	 * Declared in the MealBuilder class
	 * <p> The {@code repareVegiBurgerMeal()} method . . . .
	 */

	public Meal prepareVegiBurgerMeal() {
		Meal meal = new Meal();
		meal.addItem(new BurgerVegiBurger());
		meal.addItem(new DrinkCoke());
		return meal;
	}

	/**
	 * @author HossaiM
	 * <br>
	 * Declared in the MealBuilder class
	 * <p> The {@code prepareBeafiBurgerMeal()} method . . . .
	 */
	public Meal prepareBeafiBurgerMeal (){
		Meal meal = new Meal();
		meal.addItem(new BurgerBeafBurger());
		meal.addItem(new DrinkPepsi());
		return meal;
	}

	/**
	 * @author HossaiM
	 * <br>
	 * Declared in the MealBuilder class
	 * <p> The {@code prepareChickenBurgerMeal()} method . . . .
	 */
	public Meal prepareChickenBurgerMeal (){
		Meal meal = new Meal();
		meal.addItem(new BurgerChickenBurger());
		meal.addItem(new DrinkPepsi());
		return meal;
	}

}
