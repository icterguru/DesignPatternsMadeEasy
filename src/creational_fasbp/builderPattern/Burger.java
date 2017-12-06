package creational_fasbp.builderPattern;

public abstract class Burger implements Item {
	@Override
	public Packing packing() {
		return new PackingWrapper();
	}

	@Override
	public abstract float price();

}
