package oose.a2b;

import java.util.ArrayList;

public class Systeem {

	private Verkeersinformatie[] verkeersinformatie;

	private Route[] route;

	private Verkeersmelding[] verkeersmelding;

	public void Systeem() {
		//Database vullen voor Robin
	}

	/**
	 *  
	 */
	public ArrayList<Route> getRoutes(String beginpunt, String eindpunt) {
		return null;
	}

	/**
	 *  
	 */
	public Route kiesRoute(int routenummer) {
		return null;
	}

	/**
	 *  
	 */
	public boolean melden(Verkeersmelding verkeersMelden) {
		return false;
	}

	public ArrayList verkeersinformatieBekijken(Verbindingsstuk verbindingsstuk) {
		return null;
	}

	public boolean verkeersinformatieToevoegen(Verkeersinformatie verkeersinformatie) {
		return false;
	}

	public boolean verkeersmeldingAccepteren(Verkeersmelding verkeersmelding) {
		return false;
	}

	public ArrayList verkeersmeldingBekijken() {
		return null;
	}

}
