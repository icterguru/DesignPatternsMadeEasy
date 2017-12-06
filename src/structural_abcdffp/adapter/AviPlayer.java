package structural_abcdffp.adapter;

public class AviPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		  System.out.println("Playing avi file. Name: "+ fileName);

	}

	@Override
	public void playMp4(String fileName) {
		// doNothing

	}

	@Override
	public void playAvi(String fileName) {
		// TODO Auto-generated method stub

	}

}
