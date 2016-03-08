package oose.a2b;

public class Flitspaal extends Verkeersinformatie {

	private float hectometerpaal;

	private Verkeersinformatie verkeersinformatie;

	public boolean wijzigen(float hectometerpaal) {
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
