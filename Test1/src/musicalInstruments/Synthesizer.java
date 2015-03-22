package musicalInstruments;


public class Synthesizer extends Keyboard {
	
	@Override
	public void tune() {
		checkElectricalConnection();
		super.tune();
	}

	private void checkElectricalConnection() {
		System.out.println("Checking th electrical connection");
		
	}

}
