package oose.a2b;

public class Verkeersmelding {
    private String beschrijving;
    private String gebruiker;
    private Verbindingsstuk verbindingsstuk;
    private Verkeersinformatie verkeersinformatie;

    public Verkeersmelding(String beschrijving, String gebruiker, Verbindingsstuk verbindingsstuk) {
        this.beschrijving = beschrijving;
        this.gebruiker = gebruiker;
        this.verbindingsstuk = verbindingsstuk;
    }

    public boolean verwijderen() {
        return false;
    }

    public boolean wijzigen() {
        return false;
    }
}
