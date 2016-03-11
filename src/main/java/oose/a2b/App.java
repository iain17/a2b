package oose.a2b;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        //Use case: Ophalen verkeersinformatie
        Automobilist automobilist = new Automobilist();

<<<<<<< HEAD
        //Use case: Geregisteerde automobilist meld nieuwe verkeersinformatie.
        automobilist.meld("File op de A13 tussen Nijmegen en Ressen");
=======
        Route route = automobilist.getRoute();
        ArrayList<Verbindingsstuk> verbindingsstukken = route.getVerbindingsstukken();

        for (int ii = 0; ii < verbindingsstukken.size(); ii++) {
            Verbindingsstuk verbindingsstuk = verbindingsstukken.get(ii);
            ArrayList<Verkeersinformatie> verkeersinformaties = verbindingsstuk.getVerkeersinformaties();

            for (int iii = 0; iii < verkeersinformaties.size(); iii++) {
                Verkeersinformatie verkeersinformatie = verkeersinformaties.get(iii);
                System.out.println(verkeersinformatie.beschrijving());
            }
        }
>>>>>>> 8bfaa5c0b3505474642ceff41bb53863513b15fc

    }
}
