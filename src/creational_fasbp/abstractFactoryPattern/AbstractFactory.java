package creational_fasbp.abstractFactoryPattern;


public abstract class AbstractFactory {
	abstract IShape getShape(String shape);

 // Other abstract methods go below, if any, as follows
	abstract IShape fillColor(String color);

}
