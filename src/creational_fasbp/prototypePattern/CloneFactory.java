package creational_fasbp.prototypePattern;

public class CloneFactory {

	public Animal getClone(Animal anAnimal){
		return anAnimal.makeCopy();
	}


}
