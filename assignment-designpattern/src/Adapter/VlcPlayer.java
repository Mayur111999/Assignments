package Adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlCFile(String fileName) {
		
		 System.out.println("Playing vlc file....Name: "+ fileName);		
	}

	@Override
	public void playMp4File(String fileName) {
		
	}

}
