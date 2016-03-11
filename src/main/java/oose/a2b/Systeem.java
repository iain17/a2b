package oose.a2b;

import java.util.ArrayList;

public class Systeem {
    private ArrayList<Route> routes = new ArrayList<Route>();
    private ArrayList<Verbindingsstuk> Verbindingsstukken = new ArrayList<Verbindingsstuk>();
    private ArrayList<Verbindingsstuk> mogelijkeVerbindingsstukken = new ArrayList<Verbindingsstuk>();
    private ArrayList<Route> mogelijkeRoutes = new ArrayList<Route>();
    private Automobilist automobilist;

    public Systeem(Automobilist automobilist) {
        this.automobilist = automobilist;
        ArrayList<Verbindingsstuk> route1 = new ArrayList<Verbindingsstuk>();
        ArrayList<Verbindingsstuk> route2 = new ArrayList<Verbindingsstuk>();

        Locatie Waalbrug = new Locatie("Waalbrug");
        Locatie Nijmegen = new Locatie("Nijmegen");
        Locatie Arnhem = new Locatie("Arnhem");
        Locatie Ressen = new Locatie("Ressen");

        Verbindingsstuk nijmegenRessen = new Verbindingsstuk(Nijmegen, Ressen, 15.0f, 10.7f);
        Verbindingsstukken.add(nijmegenRessen);
        Verbindingsstuk nijmegenWaalbrug = new Verbindingsstuk(Nijmegen, Waalbrug, 10, 13.7f);
        Verbindingsstukken.add(nijmegenWaalbrug);
        Verbindingsstuk RessenArnhem = new Verbindingsstuk(Ressen, Arnhem, 20.0f, 15.7f);
        Verbindingsstukken.add(RessenArnhem);
        Verbindingsstuk WaalbrugArnhem = new Verbindingsstuk(Waalbrug, Arnhem, 10.0f, 9.7f);
        Verbindingsstukken.add(WaalbrugArnhem);

        route1.add(nijmegenRessen);
        route1.add(RessenArnhem);

        route2.add(nijmegenWaalbrug);
        route2.add(WaalbrugArnhem);

        //Geregisteerde gebruiker heeft een melding gegeven.
        //melden("File op de A13 tussen Nijmegen en Ressen", nijmegenRessen);
        //melden("File op de A4 tussen Ressen en Arnhem", RessenArnhem);

        //File die al bestaat
        new File(5, 6, 10, nijmegenRessen);
        new Belemmering("Weg afgesloten", "2016-03-11", "2016-04-11", nijmegenRessen);

        routes.add(new Route(Nijmegen, Arnhem, this, route1));
        routes.add(new Route(Nijmegen, Arnhem, this, route2));
    }

    public String getRoutes(String beginpunt, String eindpunt) {
        String output = "";

        for (Route route : routes) {
            if (route.getBeginpunt().getNaam().equalsIgnoreCase(beginpunt) && route.getEindpunt().getNaam().equalsIgnoreCase(eindpunt)) {
                mogelijkeRoutes.add(route);
            }
        }

        if (mogelijkeRoutes.size() > 0) {
            int i = 0;

            output += "Mogelijke routes tussen " + beginpunt + " en " + eindpunt + ":\n";

            for (Route route : mogelijkeRoutes) {
                output += "Route " + String.valueOf(i) + ": " + route.getKm() + " kilometers en " + route.getReistijd() + " minuten\n";
                output += "Gaat via:\n";
                for (Verbindingsstuk verbindingsstuk : route.getVerbindingsstukken()) {
                    output += "\tVerbindingsstuk: " + verbindingsstuk.getTraject() + "\n";
                }
                i++;
            }
        } else {
            output += "Geen routes beschikbaar.\n";
            return null;
        }

        return output;
    }

    public String kiesRoute(int routeNr) {
        String output = "";

        if (routeNr < 0 || routeNr >= mogelijkeRoutes.size()) {
            output += "Ongeldig routenummer!\n";
            System.exit(-1);
        }

        output += "Je hebt gekozen voor route " + String.valueOf(routeNr) + "!\n";

        Route route = mogelijkeRoutes.get(routeNr);
        ArrayList<Verbindingsstuk> verbindingsstukken = route.getVerbindingsstukken();

        for (int i = 0; i < verbindingsstukken.size(); i++) {
            Verbindingsstuk verbindingsstuk = verbindingsstukken.get(i);
            ArrayList<Verkeersinformatie> verkeersinformaties = verbindingsstuk.getVerkeersinformaties();

            for (int j = 0; j < verkeersinformaties.size(); j++) {
                Verkeersinformatie verkeersinformatie = verkeersinformaties.get(j);
                output += verkeersinformatie.beschrijving() + "\n";
            }
        }

        return output;
    }

    public String getVerbindingsstukken(int routeNr) {
        String output = "Mogelijke verbindingsstukken om een melding over te plaatsen:\n";

        Route route = mogelijkeRoutes.get(routeNr);
        mogelijkeVerbindingsstukken = route.getVerbindingsstukken();

        for (int i = 0; i < mogelijkeVerbindingsstukken.size(); i++) {
            output += i + " " + mogelijkeVerbindingsstukken.get(i).getTraject() + "\n";
        }

        return output;
    }

    public boolean melden(int verbindingsstukNr, String beschrijving) {
        Verkeersmelding verkeersmelding = new Verkeersmelding(beschrijving, this.automobilist, mogelijkeVerbindingsstukken.get(verbindingsstukNr));
        return true;
    }

    public ArrayList<Verbindingsstuk> getVerbindingsstukken() {
        return Verbindingsstukken;
    }
}
