package oose.a2b;

import java.util.ArrayList;
import java.util.List;

public class Systeem {
    private List<Verkeersinformatie> verkeersinformatie = new ArrayList<Verkeersinformatie>();

    private List<Route> route = new ArrayList<Route>();

    private List<Verkeersmelding> verkeersmelding = new ArrayList<Verkeersmelding>();

    public Systeem() {
        verkeersmelding.add(new Verkeersmelding("File op de A13 tussen Den Haag en Rotterdam", "Robin", new Verbindingsstuk()));
        verkeersmelding.add(new Verkeersmelding("File op de A4 tussen Amsterdam en Schiphol", "Iain", new Verbindingsstuk()));

        List<Verbindingsstuk> verbindingsstukken = new ArrayList<Verbindingsstuk>();
        verbindingsstukken.add(new Verbindingsstuk());

        route.add(new Route(0, "Den Haag", "Rotterdam", 5, 10, this, verbindingsstukken));

        verkeersinformatie.add(new File(5, 50, 55, null));
        verkeersinformatie.add(new File(7, 43, 50, null));
        verkeersinformatie.add(new File(15, 105, 125, null));
        verkeersinformatie.add(new Flitspaal(7, null));
        verkeersinformatie.add(new Radarcontrole(71, null));
    }

    public List<Route> getRoutes(String beginpunt, String eindpunt) {
        return route;
    }

    public Route kiesRoute(int routenummer) {
        return null;
    }

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
