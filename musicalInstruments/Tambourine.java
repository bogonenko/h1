package musicalInstruments;

public final class Tambourine extends Idiophones {
	
	@Override
	public void tune() {
		super.tune();
		shake();
	}
	
	private void shake() {
		System.out.println("Shaking the tambourine and check sound");
	}

}
