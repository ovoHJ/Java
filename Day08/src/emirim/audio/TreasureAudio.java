package emirim.audio;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class TreasureAudio {

	public TreasureAudio() {
		try {
			AudioInputStream stream = AudioSystem.getAudioInputStream(new File("audio/treasure_effect.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
