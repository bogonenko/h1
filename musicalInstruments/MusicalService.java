package musicalInstruments;


public class MusicalService {

	public static void main(String[] args) {

		MusicalInstrument[] instruments = new MusicalInstrument[8];

		instruments[0] = new Tambourine();
		instruments[1] = new Drum();
		instruments[2] = new Guitar();
		instruments[3] = new Violin();
		instruments[4] = new Flute();
		instruments[5] = new Tuba();
		instruments[6] = new Synthesizer();
		instruments[7] = new Piano();

		for (MusicalInstrument instrument : instruments) {
			instrument.clean();
			instrument.tune();
			instrument.play();
		}

	}

}
