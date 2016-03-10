package oose.a2b;

public class File extends Verkeersinformatie {
    private float lengteKM;

    private float beginpuntKM;

    private float eindpuntKM;

    private Verkeersinformatie verkeersinformatie;

    //manually added, missing in Astah
    public File(float lengteKM, float beginpuntKM, float eindpuntKM, Verkeersinformatie verkeersinformatie) {
        this.lengteKM = lengteKM;
        this.beginpuntKM = beginpuntKM;
        this.eindpuntKM = eindpuntKM;
        this.verkeersinformatie = verkeersinformatie;
    }

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
