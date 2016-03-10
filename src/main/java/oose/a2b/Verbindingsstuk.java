package oose.a2b;

import java.util.ArrayList;
import java.util.List;

public class Verbindingsstuk {
    private String naam;

    private float gemiddeldeReistijd;

    private ArrayList<Verkeersinformatie> verkeersinformatie = new ArrayList<Verkeersinformatie>();

    private ArrayList<Verkeersmelding> verkeersmelding = new ArrayList<Verkeersmelding>();

    public ArrayList<Verkeersinformatie> getVerkeersinformatie() {
        return verkeersinformatie;
    }
}
