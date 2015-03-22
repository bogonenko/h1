package musicalInstruments;

public class Drum extends Membranophones {
	
	@Override
	public void tune() {
		super.tune();
		hit();
	}

	private void hit() {
		System.out.println("Hit and check membrane");
	}

}
