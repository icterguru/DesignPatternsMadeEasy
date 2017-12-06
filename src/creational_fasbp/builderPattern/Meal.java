package creational_fasbp.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
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
