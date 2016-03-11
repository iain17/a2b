package oose.a2b;

public class File extends Verkeersinformatie {
    private float hectometerpaalBegin;
    private float hectometerpaalEind;
    private float minuten;

    public File(float hectometerpaalBegin, float hectometerpaalEind, float minuten, Verbindingsstuk verbindingsstuk) {
        super(verbindingsstuk);
        this.hectometerpaalBegin = hectometerpaalBegin;
        this.hectometerpaalEind = hectometerpaalEind;
        this.minuten = minuten;
    }

    public boolean wijzigen(float hectometerpaalBegin, float hectometerpaalEind, float minuten) {
        this.hectometerpaalBegin = hectometerpaalBegin;
        this.hectometerpaalEind = hectometerpaalEind;
        this.minuten = minuten;
        return true;
    }

    @Override
    public String beschrijving() {
        return String.format("Een file tussen hectometerpaal %.1f en hectometerpaal %.1f met als totale afstand %.1f kilometer.", hectometerpaalBegin, hectometerpaalEind, getAfstand());
    }

    @Override
    public float getMinuten() {
        return minuten;
    }

    public float getAfstand() {
        return Math.abs(hectometerpaalEind - hectometerpaalBegin);
    }
}
