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
        float totaleAfstand = 0;

        for (Verbindingsstuk verbindingsstuk : verbindingsstukken) {
            totaleAfstand += verbindingsstuk.getKM();
        }

        return totaleAfstand;
    }

    public float getReistijd() {
        float totaleGemiddeldeReistijd = 0;

        for (Verbindingsstuk verbindingsstuk : verbindingsstukken) {
            totaleGemiddeldeReistijd += verbindingsstuk.getGemiddeldeReistijd();
        }

        return totaleGemiddeldeReistijd;
    }
}
