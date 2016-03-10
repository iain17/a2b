package oose.a2b;

import java.util.ArrayList;
import java.util.List;

public class Route {
    private int routenummer;

    private String beginpunt;

    private String eindpunt;

    private float km;

    private float reistijd;

    private Systeem systeem;

    private List<Verbindingsstuk> verbindingsstuk = new ArrayList<Verbindingsstuk>();

    //manually added, missing in Astah
    public Route(int routenummer, String beginpunt, String eindpunt, float km, float reistijd, Systeem systeem, List<Verbindingsstuk> verbindingsstukken) {
        this.routenummer = routenummer;
        this.beginpunt = beginpunt;
        this.eindpunt = eindpunt;
        this.km = km;
        this.systeem = systeem;
        this.verbindingsstuk = verbindingsstukken;
    }

    public List<Verbindingsstuk> getVerbindingsstukken() {
        return verbindingsstuk;
    }
}
