package oose.a2b;

import java.util.Date;

public class Verkeersmelding {

	private String beschrijving;

	private String gebruiker;

	private Date van;

	private Date tot;

	private Verbindingsstuk locatie;

	private Verkeersinformatie verkeersinformatie;

	private Verbindingsstuk verbindingsstuk;

	private Systeem systeem;

	public boolean verwijderen() {
		return false;
	}

	public boolean wijzigen() {
		return false;
	}

	/**
	 *  
	 */
	public Verkeersmelding(String beschrijving, String gebruiker, Verbindingsstuk locatie) {

	}

}
