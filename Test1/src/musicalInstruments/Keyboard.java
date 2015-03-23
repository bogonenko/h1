package musicalInstruments;

public abstract class Keyboard extends MusicalInstrument {

	@Override
	public void play() {
		System.out.println("Playing the "
				+ this.getClass().getSimpleName().toLowerCase());
		System.out.println();
	}

	@Override
	public void tune() {
		checkKeys();
		System.out.println("Tuning the "
				+ this.getClass().getSimpleName().toLowerCase());

	}

	private void checkKeys() {
		System.out.println("Checking instrument's keys");

	}

}
