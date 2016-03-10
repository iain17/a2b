package oose.a2b;

import java.util.List;

public class App {
    public static void main(String[] args) {
        //USECASE: Ophalen verkeersinformatie
        Systeem systeem = new Systeem();

        List<Route> mogelijkeRoutes = systeem.getRoutes("Nijmegen", "Arnhem");

        for (int i = 0; i < mogelijkeRoutes.size(); i++) {
            Route route = mogelijkeRoutes.get(i);
            List<Verbindingsstuk> verbindingsstukken = route.getVerbindingsstukken();

            for (int ii = 0; ii < verbindingsstukken.size(); ii++) {
                Verbindingsstuk verbindingsstuk = verbindingsstukken.get(ii);
                List<Verkeersinformatie> verkeersinformaties = verbindingsstuk.getVerkeersinformatie();

                for (int iii = 0; iii < verkeersinformaties.size(); iii++) {
                    Verkeersinformatie verkeersinformatie = verkeersinformaties.get(iii);
                    System.out.println(verkeersinformatie.beschrijving());
                }
            }
        }
    }
}
