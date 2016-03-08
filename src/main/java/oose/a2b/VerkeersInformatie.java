package oose.a2b;

public abstract class VerkeersInformatie extends Verbindingsstuk {

	private File file;

	private Flitspaal flitspaal;

	private Belemmering belemmering;

	private Radarcontrole radarcontrole;

	private Verbindingsstuk[] verbindingsstuk;

	private Verkeersmelding verkeersmelding;

	public abstract String beschrijving();

	public abstract boolean verwijderen();

}
