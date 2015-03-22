package musicalInstruments;

public class Piano extends Keyboard {
	
	@Override
	public void tune() {
		tuneWithTuningFork();
		super.tune();
	}

	private void tuneWithTuningFork() {
		System.out.println("Using the tuning-fork for tuning sound.");
	}

}
