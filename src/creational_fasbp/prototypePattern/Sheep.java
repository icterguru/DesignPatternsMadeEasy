package creational_fasbp.prototypePattern;

/**
 * @author HossaiM
 *
 */
public class Sheep implements Animal{
	/**
	 * @author HossaiM
	 * <br><br>
	 * Declared in the Sheep class
	 *
	 */

	public Sheep(){
		System.out.println("A Sheep object is created");
	}

	/**
	 * @author HossaiM
	 * <br><br>
	 * Declared in the Sheep class
	 *
	 */
	public Animal makeCopy() {
		System.out.println("A Sheep is being copied..");

		Sheep sheepObject = null;

		try {
			sheepObject = (Sheep) super.clone();
		}

		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return sheepObject;
	}

	/**
	 * @author HossaiM
	 * <br> Overridden toString() inside the Sheep class
	 */
	@Override
	public String toString(){

		return "I like my sheep!!";

	}

}
