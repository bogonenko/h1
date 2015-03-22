package musicalInstruments;

public abstract class Plucked extends Stringed {
	
	@Override
	public void tune() {
		System.out.println("Tuning the plucked instrument: " + this.getClass().getSimpleName().toLowerCase());
		checkStrings();
	}
}
