package structural_abcdffp.adapter;

public class AdapterPatternMainApp {

	public static void main(String[] args) {
		 AdaptedAudioPlayer audioPlayer = new AdaptedAudioPlayer();

	      audioPlayer.play("mp3", "beyond the horizon.mp3");
	      audioPlayer.play("mp4", "alone.mp4");
	      audioPlayer.play("vlc", "far far away.vlc");
	      audioPlayer.play("avi", "mind me.avi");
	      audioPlayer.play("dvd", "mind me.dvd");
	   }
	}

