package oose.a2b;

import java.util.ArrayList;

public class Systeem {
    private ArrayList<Verkeersinformatie> verkeersinformatie = new ArrayList<Verkeersinformatie>();

    private ArrayList<Route> routes = new ArrayList<Route>();

    private ArrayList<Verkeersmelding> verkeersmelding = new ArrayList<Verkeersmelding>();

    public Systeem() {
        verkeersmelding.add(new Verkeersmelding("File op de A13 tussen Den Haag en Rotterdam", "Robin", new Verbindingsstuk()));
        verkeersmelding.add(new Verkeersmelding("File op de A4 tussen Amsterdam en Schiphol", "Iain", new Verbindingsstuk()));

        ArrayList<Verbindingsstuk> verbindingsstukken = new ArrayList<Verbindingsstuk>();
        verbindingsstukken.add(new Verbindingsstuk());

        routes.add(new Route("Den Haag", "Rotterdam", this, verbindingsstukken));

        verkeersinformatie.add(new File(5, 50, 55, null));
        verkeersinformatie.add(new File(7, 43, 50, null));
        verkeersinformatie.add(new File(15, 105, 125, null));
        verkeersinformatie.add(new Flitspaal(7, null));
        verkeersinformatie.add(new Radarcontrole(71, null));
    }

    public ArrayList<Route> getRoutes(String beginpunt, String eindpunt) {
        ArrayList<Route> mogelijkeRoutes = new ArrayList<Route>();

        for (Route route : routes) {
            if (route.getBeginpunt().equalsIgnoreCase(beginpunt) && route.getEindpunt().equalsIgnoreCase(eindpunt)) {
                mogelijkeRoutes.add(route);
            }
        }

        return mogelijkeRoutes;
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
