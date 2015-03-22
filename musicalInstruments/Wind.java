package musicalInstruments;

public abstract class Wind extends MusicalInstrument {
	@Override
	public void play() {
		System.out.println("Playing the "
				+ this.getClass().getSimpleName().toLowerCase());
		System.out.println();
	}

	@Override
	public void tune() {
		checkAirTemperature();
		System.out.println("Tuning the "
				+ this.getClass().getSimpleName().toLowerCase());

	}

	private void checkAirTemperature() {
		System.out.println("Checking air temperature");
	}

}
