package oose.a2b;

import java.util.ArrayList;

public class Route {
    private Locatie beginpunt;
    private Locatie eindpunt;
    private Systeem systeem;
    private ArrayList<Verbindingsstuk> verbindingsstukken = new ArrayList<Verbindingsstuk>();

    public Route(Locatie beginpunt, Locatie eindpunt, Systeem systeem, ArrayList<Verbindingsstuk> verbindingsstukken) {
        this.beginpunt = beginpunt;
        this.eindpunt = eindpunt;
        this.systeem = systeem;
        this.verbindingsstukken = verbindingsstukken;
    }

    public ArrayList<Verbindingsstuk> getVerbindingsstukken() {
        return verbindingsstukken;
    }

    public Locatie getBeginpunt() {
        return beginpunt;
    }

    public void setBeginpunt(Locatie beginpunt) {
        this.beginpunt = beginpunt;
    }

    public Locatie getEindpunt() {
        return eindpunt;
    }

    public void setEindpunt(Locatie eindpunt) {
        this.eindpunt = eindpunt;
    }

    public float getKm() {
        float totalKM = 0;
        for (Verbindingsstuk verbindingsstuk : verbindingsstukken) {
            totalKM += verbindingsstuk.getKM();
        }

        return totalKM;
    }

    public float getReistijd() {
        float totalGemiddeldeReisTijds = 0;
        for (Verbindingsstuk verbindingsstuk : verbindingsstukken) {
            totalGemiddeldeReisTijds += verbindingsstuk.getGemiddeldeReistijd();
        }
        return totalGemiddeldeReisTijds;
    }
}
