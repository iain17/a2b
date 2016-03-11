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
        meld();
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

    public void meld() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        try {
            System.out.print("Wilt u een melding doorgeven? (y/n): ");
            input = br.readLine();

        } catch (Exception e) {
            System.err.println("Ongeldige invoer!");
        }
        System.out.println(input+"\n");
        if (!input.equalsIgnoreCase("y")) {
            return;
        }

        System.out.println(systeem.getVerbindingsstuk(routeNummer));

        int verbindingsstukNummer = -1;
        System.out.print("Voer een verbindingsstuknummer in: ");

        try {
            verbindingsstukNummer = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.err.println("Ongeldig verbindingsstuknummer!");
            System.exit(-1);
        }

        String beschrijving = "";
        try {
            System.out.print("Voer uw melding in: ");
            beschrijving = br.readLine();

        } catch (Exception e) {
            System.err.println("Ongeldige invoer!");
        }

        systeem.melden(verbindingsstukNummer, beschrijving);
    }
}
