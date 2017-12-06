package creational_fasbp.prototypePattern;

/**
 * @author HossaiM
 *
 */
public class Dog implements Animal{
	/**
	 * @author HossaiM
	 * <br><br>
	 * Declared in the Dog class
	 *
	 */

	public Dog(){
		System.out.println("A Dog object is created");
	}

	/**
	 * @author HossaiM
	 * <br><br>
	 * Declared in the Dog class
	 *
	 */
	public Animal makeCopy() {
		System.out.println("A Dog is being copied..");
		Dog dogObject = null;

		try {
			dogObject = (Dog) super.clone();
		}

		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return dogObject;
	}

	/**
	 * @author HossaiM
	 * <br> Overridden toString() inside the Dog class
	 */
	@Override
	public String toString(){

		return "I like my dog!!";

	}

	}

