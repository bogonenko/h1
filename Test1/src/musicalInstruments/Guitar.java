package musicalInstruments;

public class Guitar extends Plucked {
	
	@Override
	public void play() {
		choosePlectrum();
		super.play();
		System.out.println();
	}

	private void choosePlectrum() {
		System.out.println("Choosing the plectrum");
	}
	
	

}
