package oose.a2b;

public class File extends Verkeersinformatie {
    private float hectometerpaalBegin;
    private float hectometerpaalEind;
    private float minuten;

    public File(float hectometerpaalBegin, float hectometerpaalEind, float minuten) {
        this.hectometerpaalBegin = hectometerpaalBegin;
        this.hectometerpaalEind = hectometerpaalEind;
        this.minuten = minuten;
    }

    public boolean wijzigen(float lengteKM, float beginpuntKM, float eindpuntKM) {
        return false;
    }

    @Override
    public String beschrijving() {
        return String.format("Een file bij hectometerpaal: %.1f tot %.1f. Van %.1f kilometer", hectometerpaalBegin, hectometerpaalEind, getAfstand());
    }

    @Override
    public float getMinuten() {
        return minuten;
    }

    public float getAfstand() {
        return Math.abs(hectometerpaalEind - hectometerpaalBegin);
    }
}
