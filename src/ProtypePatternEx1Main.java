

/**
 * @author HossaiM
 * <br>
 * https://www.youtube.com/watch?v=AFbZhRL0Uz8
 *
 * <br>
 * See also: https://www.youtube.com/watch?v=jFquZRf5jIo
 */

interface Animal extends Cloneable{
	/**
	 * @author HossaiM
	 * <br><br>
	 * Declared in the Animal interface
	 *
	 */
	public Animal makeCopy();

}

class Dog implements Animal{
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

class Sheep implements Animal{
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

class CloneFactory {

	public Animal getClone(Animal anAnimal){
		return anAnimal.makeCopy();
	}


}


public class ProtypePatternEx1Main {

	public static void main(String[] args) {

		CloneFactory animalMaker = new CloneFactory();
		Sheep shelly = new Sheep();
		System.out.println(shelly);
		System.out.println("dolly is located at: " + System.identityHashCode(shelly));
		Sheep clonedShelly = (Sheep) animalMaker.getClone(shelly);
		System.out.println(clonedShelly);
		System.out.println("ClonedShelly is located at: " + System.identityHashCode(clonedShelly));

		System.out.println();

		Dog dolly = new Dog();
		System.out.println(dolly);
		System.out.println("dolly is located at: " + System.identityHashCode(dolly));
		Dog clonedDolly = (Dog) animalMaker.getClone(dolly);
		System.out.println(clonedDolly);
		System.out.println("ClonedDolly is located at: " + System.identityHashCode(clonedDolly));

	}


}
