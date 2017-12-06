package creational_fasbp.abstractFactoryPattern;


public class FactoryProducer {
/**
 * @author HossaiM
 * <p>
 * /** Defined inside the ShapeFactory class
 * <br>
 * The {@code ShapeFactory()} method will call the {@code ShapeFactory()} <br> method </p> and  <br> bla bla ...
 *
 *
 */

	public static AbstractFactory getFactory(String factory){

		if(factory ==null)
			return null;
		else if(factory .equalsIgnoreCase("Shape"))
			return new ShapeFactory();

		return null;

	}

}
