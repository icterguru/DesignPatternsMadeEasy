package creational_fasbp.singletonPattern;

public class SingletonPatternDemoMain {
	/**
	 * @author HossaiM
	 * <br>
	 *
	 */
	public static void main(String[] args) {
		/**
		 /* SingleObject singleObject1 = new SingleObject();
		 * Since the constructor SingleObject() was made private, such a statement will not be visible/accessible here.
		 */

		ClassicSingleton singletonObject = ClassicSingleton.singletonCreator();

		singletonObject.getMessage();
	}

}
