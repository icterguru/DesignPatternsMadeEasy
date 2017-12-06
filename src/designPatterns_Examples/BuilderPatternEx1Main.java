
/**
 * @author HossaiM
 *
 */


import java.util.ArrayList;
import java.util.List;


interface Item {
	/**
	 * @author HossaiM
	 * Declared in the Item interface
	 * <p> The {@code name()} method . . . .
	 */

	public String name();

	/**
	 * @author HossaiM
	 * Declared in the Item interface
	 * <p> The {@code packing()} method . . . .
	 */

	public Packing packing();

	/**
	 * @author HossaiM
	 * Declared in the Item interface
	 * <p> The {@code price()} method . . . .
	 */

	public float price();
}

abstract class Burger implements Item {
	@Override
	public Packing packing() {
		return new PackingWrapper();
	}

	@Override
	public abstract float price();

}



class BurgerBeafBurger extends Burger {

	@Override
	public String name() {

		return "Beaf Burger";
	}

	@Override
	public float price() {
		return 6.00f;
	}

}
class BurgerChickenBurger extends Burger {

	@Override
	public String name() {

		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 4.00f;
	}

}

class BurgerVegiBurger extends Burger {

	@Override
	public String name() {

		return "Vegi Burger";
	}

	@Override
	public float price() {
			return 2.50f;
	}

}

abstract class Drink implements Item {

	@Override
	public Packing packing() {
		return new PackingBottle();
	}

	@Override
	public abstract float price();

}

class DrinkCoke extends Drink{

	@Override
	public String name() {

		return "Drink Coke";
	}

	@Override
	public float price() {
		return 1.49f;
	}

}

class DrinkPepsi extends Drink {

	@Override
	public String name() {

		return "Pepsi";
	}

	@Override
	public float price() {

		return 0.99f;
	}


}


interface Packing {
	public String pack();
}

class PackingBottle implements Packing {

	@Override
	public String pack() {
		return "Bottle Pack";
	}

}


class PackingWrapper implements Packing {

	@Override
	public String pack() {

		return "Wrapper pack";
	}

}

class Meal {
	private  List<Item> items = new ArrayList<Item>();

	/**
	 * @author HossaiM
	 * <br>
	 * Declared in the Meal class
	 * <p> The {@code addItem()} method . . . .
	 */
	public void addItem(Item item){
		items.add(item);
	}

	/**
	 * @author HossaiM
	 * <br>
	 * Declared in the Meal class
	 * <p> The {@code getCost()} method . . . .
	 */
	public float getCost() {
		float cost = 0.0f;

		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	/**
	 * @author HossaiM
	 * <br>
	 * Declared in the Meal class
	 * <p> The {@code showItem()} method . . . .
	 */
	public void showItems() {
		for (Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}

}

class MealBuilder {

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


public class BuilderPatternEx1Main {

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

