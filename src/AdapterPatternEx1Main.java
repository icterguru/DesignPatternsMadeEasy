

interface MediaPlayer {
	public void play(String audioType, String fileName);


}

class AdaptedAudioPlayer implements MediaPlayer {
	 MediaAdapter mediaAdapter;

	   @Override
	   public void play(String audioType, String fileName) {

	      //inbuilt support to play mp3 music files
	      if(audioType.equalsIgnoreCase("mp3")){
	         System.out.println("Playing mp3 file. Name: " + fileName);
	      }

	      //mediaAdapter is providing support to play other file formats
	      else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")|| audioType.equalsIgnoreCase("avi")){
	         mediaAdapter = new MediaAdapter(audioType);
	         mediaAdapter.play(audioType, fileName);
	      }

	      else{
	         System.out.println("Invalid media. " + audioType + " format not supported");
	      }
	   }

}

class Mp4Player implements AdvancedMediaPlayer {


	@Override
	public void playMp4(String fileName) {
			System.out.println("Playing mp4 file. Name: "+ fileName);
	}

	@Override
	public void playVlc(String fileName) {
		// doNothing

	}

	@Override
	public void playAvi(String fileName) {
		// doNothing

	}

}


class AviPlayer implements AdvancedMediaPlayer {

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

class VlcPlayer implements AdvancedMediaPlayer {

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

class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;

	   public MediaAdapter(String audioType){

	      if(audioType.equalsIgnoreCase("vlc") ){
	         advancedMusicPlayer = new VlcPlayer();

	      }else if (audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer = new Mp4Player();
	      }

	   else if (audioType.equalsIgnoreCase("avi")){
	         advancedMusicPlayer = new AviPlayer();
	      }
	   }

	   @Override
	   public void play(String audioType, String fileName) {

	      if(audioType.equalsIgnoreCase("vlc")){
	         advancedMusicPlayer.playVlc(fileName);
	      }
	      else if(audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer.playMp4(fileName);
	      }
	      else if(audioType.equalsIgnoreCase("avi")){
		         advancedMusicPlayer.playAvi(fileName);
		      }
	   }

}

interface AdvancedMediaPlayer {
	public void playVlc(String fileName);
	public void playMp4(String fileName);
	public void playAvi(String fileName);

}


public class AdapterPatternEx1Main {

	public static void main(String[] args) {
		 AdaptedAudioPlayer audioPlayer = new AdaptedAudioPlayer();

	      audioPlayer.play("mp3", "beyond the horizon.mp3");
	      audioPlayer.play("mp4", "alone.mp4");
	      audioPlayer.play("vlc", "far far away.vlc");
	      audioPlayer.play("avi", "mind me.avi");
	      audioPlayer.play("dvd", "mind me.dvd");
	   }
	}

