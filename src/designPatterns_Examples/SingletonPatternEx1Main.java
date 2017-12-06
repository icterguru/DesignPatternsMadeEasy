

class ClassicSingleton {

	/**
	 * Private constructor
	 */
	private ClassicSingleton(){}  // private constructor

	/**
	   * SingletonHolder is loaded on the first execution of ClassicSingleton.singletonCreator()
	   * or the first access to SingletonHolder.theInstance, not before.
	   */
	private static class SingletonHolder {
		private static ClassicSingleton theInstance = null;
	}

	/**
	 * <br> Returning theInstance
	 *
	 */
	public static ClassicSingleton singletonCreator(){
		if (SingletonHolder.theInstance == null){
			SingletonHolder.theInstance= new ClassicSingleton();
		}
		return SingletonHolder.theInstance;
	}

	public void getMessage(){
		System.out.println("This just shows that the program runs successfully..");
	}
}

public class SingletonPatternEx1Main {
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
