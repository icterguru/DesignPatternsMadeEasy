package structural_abcdffp.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		  System.out.println("Playing vlc file. Name: "+ fileName);

	}

	@Override
	public void playMp4(String fileName) {
		// doNothing

	}

	@Override
	public void playAvi(String fileName) {
		// doNothing

	}

}
