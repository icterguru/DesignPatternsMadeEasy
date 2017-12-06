package creational_fasbp.builderPattern;

public class BurgerVegiBurger extends Burger {

	@Override
	public String name() {

		return "Vegi Burger";
	}

	@Override
	public float price() {
			return 2.50f;
	}

}
