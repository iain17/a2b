package oose.a2b;

import java.util.ArrayList;
import java.util.List;

public class Verbindingsstuk {
    private String naam;

    private List<Verkeersinformatie> verkeersinformatie = new ArrayList<Verkeersinformatie>();

    private List<Route> route = new ArrayList<Route>();

    private List<Verkeersmelding> verkeersmelding = new ArrayList<Verkeersmelding>();

    public List<Verkeersinformatie> getVerkeersinformatie() {
        return verkeersinformatie;
    }
}
