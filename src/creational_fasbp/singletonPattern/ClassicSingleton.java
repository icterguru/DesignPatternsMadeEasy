package creational_fasbp.singletonPattern;

public class ClassicSingleton {

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