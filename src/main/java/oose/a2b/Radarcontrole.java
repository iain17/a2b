package oose.a2b;

public class Radarcontrole extends VerkeersInformatie {

	private float hectorMeterPaal;

	private VerkeersInformatie verkeersInformatie;

	public boolean wijzigen(float hectorMeterPaal) {
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
