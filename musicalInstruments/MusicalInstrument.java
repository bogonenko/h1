package musicalInstruments;

public abstract class MusicalInstrument {

	protected MusicalInstrument() {

	}
	
	public void clean() {
		System.out.println("Cleaning the " + this.getClass().getSimpleName().toLowerCase());
		
	};

	public abstract void play();
	
	public abstract void tune();

}
