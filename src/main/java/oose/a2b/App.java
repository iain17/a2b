package oose.a2b;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        //Use case: Ophalen verkeersinformatie
        Systeem systeem = new Systeem();
        Automobilist automobilist = new Automobilist();

        /*for (int i = 0; i < mogelijkeRoutes.size(); i++) {
            Route route = mogelijkeRoutes.get(i);
            ArrayList<Verbindingsstuk> verbindingsstukken = route.getVerbindingsstukken();

            for (int ii = 0; ii < verbindingsstukken.size(); ii++) {
                Verbindingsstuk verbindingsstuk = verbindingsstukken.get(ii);
                ArrayList<Verkeersinformatie> verkeersinformaties = verbindingsstuk.getVerkeersinformatie();

                for (int iii = 0; iii < verkeersinformaties.size(); iii++) {
                    Verkeersinformatie verkeersinformatie = verkeersinformaties.get(iii);
                    System.out.println(verkeersinformatie.beschrijving());
                }
            }
        }*/
    }
}
