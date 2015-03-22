package musicalInstruments;

public class Violin extends Bowed {
	@Override
	public void play() {
		checkBow();
		super.play();
		System.out.println();
	}

	private void checkBow() {
		System.out.println("Checking the bow");
	}

}
