package oose.a2b;

import java.util.Date;

public class Belemmering extends Verkeersinformatie {

	private String beschrijving;

	private Date van;

	private Date tot;

	private Verkeersinformatie verkeersinformatie;

	public Boolean wijzigen(String beschrijving, Date van, Date tot) {
		return null;
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
