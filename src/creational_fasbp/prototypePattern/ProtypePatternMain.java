
package creational_fasbp.prototypePattern;


/**
 * @author HossaiM
 * <br>
 * https://www.youtube.com/watch?v=AFbZhRL0Uz8
 *
 * <br>
 * See also: https://www.youtube.com/watch?v=jFquZRf5jIo
 */

public class ProtypePatternMain {

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
