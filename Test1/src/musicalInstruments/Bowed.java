package musicalInstruments;

public abstract class Bowed extends Stringed {
	
	@Override
	public void tune() {
		System.out.println("Tuning the bowed instrument: " + this.getClass().getSimpleName().toLowerCase());
		checkStrings();
	}

}
