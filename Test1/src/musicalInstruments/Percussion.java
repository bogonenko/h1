package musicalInstruments;

public abstract class Percussion extends MusicalInstrument {
	
	@Override
	public void play() {
		countCycle();
		System.out.println("Playing the " + this.getClass().getSimpleName().toLowerCase());
		System.out.println();
	}

	private void countCycle() {
		System.out.println("Counting circles of playing");
	}
	
	

}
