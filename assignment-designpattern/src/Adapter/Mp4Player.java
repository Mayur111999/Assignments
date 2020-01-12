package Adapter;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlCFile(String fileName) {
		
	}

	@Override
	public void playMp4File(String fileName) {
		 System.out.println("Playing MP4 file..... File-Name: "+ fileName);		
	}

}
