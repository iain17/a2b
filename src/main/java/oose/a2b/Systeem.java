package oose.a2b;

import java.util.ArrayList;

public class Systeem {
    private ArrayList<Route> routes = new ArrayList<Route>();
    private ArrayList<Verkeersmelding> verkeersmelding = new ArrayList<Verkeersmelding>();

    public Systeem() {
        ArrayList<Verbindingsstuk> route1 = new ArrayList<Verbindingsstuk>();
        ArrayList<Verbindingsstuk> route2 = new ArrayList<Verbindingsstuk>();

        Locatie Waalbrug = new Locatie("Waalbrug");
        Locatie Nijmegen = new Locatie("Nijmegen");
        Locatie Arnhem = new Locatie("Arnhem");
        Locatie Ressen = new Locatie("Ressen");

        Verbindingsstuk nijmegenRessen = new Verbindingsstuk(Nijmegen, Ressen, 15.0f, 10.7f);
        Verbindingsstuk nijmegenWaalbrug = new Verbindingsstuk(Nijmegen, Waalbrug, 10, 13.7f);
        Verbindingsstuk RessenArnhem = new Verbindingsstuk(Ressen, Arnhem, 20.0f, 15.7f);
        Verbindingsstuk WaalbrugArnhem = new Verbindingsstuk(Waalbrug, Arnhem, 10.0f, 9.7f);
        route1.add(nijmegenRessen);
        route1.add(RessenArnhem);

        route2.add(nijmegenWaalbrug);
        route2.add(WaalbrugArnhem);

        //Geregisteerde gebruiker heeft een melding gegeven.
        verkeersmelding.add(new Verkeersmelding("File op de A13 tussen Nijmegen en Ressen", "Robin", nijmegenRessen));
        verkeersmelding.add(new Verkeersmelding("File op de A4 tussen Ressen en Arnhem", "Iain", RessenArnhem));

        //File die al bestaat
        RessenArnhem.addVerkeersinformatie(new File(5, 6, 10));

        routes.add(new Route(Nijmegen, Arnhem, this, route1));
        routes.add(new Route(Nijmegen, Arnhem, this, route2));
    }

    public ArrayList<Route> getRoutes(String beginpunt, String eindpunt) {
        ArrayList<Route> mogelijkeRoutes = new ArrayList<Route>();

        for (Route route : routes) {
            if (route.getBeginpunt().getNaam().equalsIgnoreCase(beginpunt) && route.getEindpunt().getNaam().equalsIgnoreCase(eindpunt)) {
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
