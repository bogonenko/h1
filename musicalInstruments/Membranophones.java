package musicalInstruments;

public abstract class Membranophones extends Percussion {
	
	@Override
	public void tune() {
		System.out.println("Tuning the membranophones instrument: "  + this.getClass().getSimpleName().toLowerCase());
	}

}
