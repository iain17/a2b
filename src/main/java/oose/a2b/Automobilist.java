package oose.a2b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Automobilist {
    private String beginpunt;
    private String eindpunt;
    private Systeem systeem = new Systeem();

    public Automobilist() {
        getPunten();
        Route route = kiesRoute();
    }

    private void getPunten() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Voer het beginpunt in: ");
            beginpunt = br.readLine();

            System.out.print("Voer het eindpunt in: ");
            eindpunt = br.readLine();
        } catch (Exception e) {
            System.err.println("Ongeldige invoer!");
        }
    }

    private Route kiesRoute() {
        if (beginpunt == null || eindpunt == null) {
            System.err.println("Geen routes beschikbaar.");
            return null;
        }

        ArrayList<Route> mogelijkeRoutes = systeem.getRoutes(beginpunt, eindpunt);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        if (mogelijkeRoutes.size() > 0) {
            int i = 0;

            System.out.println("Mogelijke routes tussen " + beginpunt + " en " + eindpunt + ":");

            for (Route route : mogelijkeRoutes) {
                System.out.println("Route " + String.valueOf(i) + " - KM: " + route.getKm() + " - Reistijd: " + route.getReistijd());
                i++;
            }
        } else {
            System.err.println("Geen routes beschikbaar.");
            return null;
        }

        int routenummer = -1;
        System.out.print("Voer een routenummer in in: ");

        try {
            routenummer = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.err.println("Ongeldig routenummer!");
            System.exit(-1);
        }

        if (routenummer < 0 || routenummer >= mogelijkeRoutes.size()) {
            System.err.println("Ongeldig routenummer!");
            System.exit(-1);
        }

        System.out.println("Je hebt gekozen voor route " + String.valueOf(routenummer) + "!");
        return mogelijkeRoutes.get(routenummer);
    }
}
