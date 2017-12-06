package creational_fasbp.builderPattern;

public abstract class Drink implements Item {

	@Override
	public Packing packing() {
		return new PackingBottle();
	}

	@Override
	public abstract float price();

}
