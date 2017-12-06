package creational_fasbp.builderPattern;

public class BurgerChickenBurger extends Burger {

	@Override
	public String name() {

		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 4.00f;
	}

}
