package oose.a2b;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Verbindingsstuk {
    private float gemiddeldeReistijd;
    private Locatie locatie1;
    private Locatie locatie2;
    private float km;
    private ArrayList<Verkeersinformatie> verkeersinformaties = new ArrayList<Verkeersinformatie>();
    private ArrayList<Verkeersmelding> verkeersmeldingen = new ArrayList<Verkeersmelding>();

    public Verbindingsstuk(Locatie locatie1, Locatie locatie2, float gemiddeldeReistijd, float km) {
        this.locatie1 = locatie1;
        this.locatie2 = locatie2;
        this.gemiddeldeReistijd = gemiddeldeReistijd;
        this.km = km;
    }


    public ArrayList<Verkeersinformatie> getVerkeersinformaties() {
        return verkeersinformaties;
    }

    public boolean addVerkeersinformatie(Verkeersinformatie verkeersinformatie) {
        return verkeersinformaties.add(verkeersinformatie);
    }

    public boolean removeVerkeersinformatie(Verkeersinformatie verkeersinformatie) {
        return verkeersinformaties.remove(verkeersinformatie);
    }

    public float getKM() {
        return km;
    }

    public float getGemiddeldeReistijd() {

        float tijd = gemiddeldeReistijd;

        for (Verkeersinformatie verkeersinformatie : verkeersinformaties) {
            tijd += verkeersinformatie.getMinuten();
        }

        return tijd;
    }

    public String getTraject() {
        return String.format("Van %s tot %s", locatie1.getNaam(), locatie2.getNaam());
    }

    public void addMelding(Verkeersmelding verkeersmelding) {
        verkeersmeldingen.add(verkeersmelding);
    }

    public boolean removeVerkeersMelding(Verkeersmelding verkeersmelding) {
        return verkeersmeldingen.remove(verkeersmelding);
    }
}
