package creational_fasbp.builderPattern;

public class BurgerBeafBurger extends Burger {

	@Override
	public String name() {

		return "Beaf Burger";
	}

	@Override
	public float price() {
		return 6.00f;
	}

}
