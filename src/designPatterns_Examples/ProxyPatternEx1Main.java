
interface Image {
	void display();
}

class PPRealImage implements Image {

	private String fileName;

	public PPRealImage(String fileName){
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(String fileName){
		System.out.println("Loading " + fileName);
	}
}

class ProxyImage implements Image{

	private PPRealImage realImage;
	private String fileName;

	public ProxyImage(String fileName){
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if(realImage == null){
			realImage = new PPRealImage(fileName);
		}
		realImage.display();
	}
}

public class ProxyPatternEx1Main {
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		//image will be loaded from disk
		image.display();
		System.out.println("");

		//image will not be loaded from disk
		image.display();
	}
}
