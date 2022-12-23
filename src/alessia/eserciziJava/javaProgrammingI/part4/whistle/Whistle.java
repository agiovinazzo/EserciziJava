package alessia.eserciziJava.javaProgrammingI.part4.whistle;

public class Whistle {

	private String sound;

	public Whistle(String sound) {
		this.sound = sound;
	}
	
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public void sound() {
		System.out.println(sound);
	}
	
}
