package oose.a2b;

import java.util.ArrayList;

public class Route {
    private String beginpunt;

    private String eindpunt;

    private Systeem systeem;

    private ArrayList<Verbindingsstuk> verbindingsstukken = new ArrayList<Verbindingsstuk>();

    public Route(String beginpunt, String eindpunt, Systeem systeem, ArrayList<Verbindingsstuk> verbindingsstukken) {
        this.beginpunt = beginpunt;
        this.eindpunt = eindpunt;
        this.systeem = systeem;
        this.verbindingsstukken = verbindingsstukken;
    }

    public ArrayList<Verbindingsstuk> getVerbindingsstukken() {
        return verbindingsstukken;
    }

    public String getBeginpunt() {
        return beginpunt;
    }

    public void setBeginpunt(String beginpunt) {
        this.beginpunt = beginpunt;
    }

    public String getEindpunt() {
        return eindpunt;
    }

    public void setEindpunt(String eindpunt) {
        this.eindpunt = eindpunt;
    }

    public float getKm() {
        for (Verbindingsstuk verbindingsstuk : verbindingsstukken) {
        }

        return 0;
    }

    public float getReistijd() {
        for (Verbindingsstuk verbindingsstuk : verbindingsstukken) {
        }

        return 0;
    }
}
