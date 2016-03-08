package oose.a2b;

public class File extends VerkeersInformatie {

	private float lengteKM;

	private float beginPuntKM;

	private float eindPuntKM;

	private VerkeersInformatie verkeersInformatie;

	public boolean wijzigen(float lengteKM, float beginPuntKM, float eindPuntKM) {
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
