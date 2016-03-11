package oose.a2b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Automobilist {
    private String beginpunt;
    private String eindpunt;
    private Systeem systeem = new Systeem(this);
    private int routeNummer;

    public Automobilist() {
        getPunten();
        routeNummer = kiesRoute();
    }

    public int getRoute() {
        return routeNummer;
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

    private int kiesRoute() {
        if (beginpunt == null || eindpunt == null) {
            System.err.println("Geen routes beschikbaar.");
            return 0;
        }

        String mogelijkeRoutes = systeem.getRoutes(beginpunt, eindpunt);

        if (mogelijkeRoutes == null) {
            System.err.println("Geen routes beschikbaar.");
            return 0;
        }

        System.out.println(mogelijkeRoutes);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int routenummer = -1;
        System.out.print("Voer een routenummer in: ");

        try {
            routenummer = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.err.println("Ongeldig routenummer!");
            System.exit(-1);
        }

        System.out.println(systeem.kiesRoute(routenummer));
        return routenummer;
    }

    public void meld(String beschrijving) {
        ArrayList<Verbindingsstuk> verbindingsstukken = systeem.getVerbindingsstukken();
        systeem.melden(beschrijving, verbindingsstukken.get(0));
    }
}
