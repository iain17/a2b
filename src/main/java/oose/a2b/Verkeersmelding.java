package oose.a2b;

public class Verkeersmelding {
    private String beschrijving;
    private Automobilist gebruiker;
    private Verkeersinformatie verkeersinformatie;
    private Verbindingsstuk verbindingsstuk;

    public Verkeersmelding(String beschrijving, Automobilist gebruiker, Verbindingsstuk verbindingsstuk) {
        this.beschrijving = beschrijving;
        this.gebruiker = gebruiker;
        this.verbindingsstuk = verbindingsstuk;
        verbindingsstuk.addMelding(this);
    }

    public void wijzigen(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public boolean verwijderen() {
        return verbindingsstuk.removeVerkeersMelding(this);
    }
}
