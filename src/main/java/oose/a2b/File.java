package oose.a2b;

public class File extends Verkeersinformatie {

	private float lengteKM;

	private float beginpuntKM;

	private float eindpuntKM;

	private Verkeersinformatie verkeersinformatie;

	public boolean wijzigen(float lengteKM, float beginpuntKM, float eindpuntKM) {
		return false;
	}

	@Override
	public String beschrijving() {
		return null;
	}

	@Override
	public boolean verwijderen() {
		return false;
	}
}
