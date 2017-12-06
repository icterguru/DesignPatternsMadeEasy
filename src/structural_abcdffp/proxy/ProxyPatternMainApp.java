package structural_abcdffp.proxy;



public class ProxyPatternMainApp {
	public static void main(String[] args) {
		Image image = new ProxyImage("Test_10mb.jpg");

		//image will be loaded from disk
		image.display();
		System.out.println("");

		//image will not be loaded from disk
		image.display();
	}
}
