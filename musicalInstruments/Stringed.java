package musicalInstruments;

public abstract class Stringed extends MusicalInstrument {
	
	@Override
	public void play() {
		System.out.println("Playing the " + this.getClass().getSimpleName().toLowerCase());
	}
	
	protected void checkStrings() {
		System.out.println("Checking strings");
	}


}
