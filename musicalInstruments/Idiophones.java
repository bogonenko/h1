package musicalInstruments;

public abstract class Idiophones extends Percussion {
	
	@Override
	public void tune() {
		System.out.println("Tuning the idiophones instrument: " + this.getClass().getSimpleName().toLowerCase());
	}

}
