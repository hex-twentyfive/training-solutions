package week12d02;

public class Site {

    private int addressParity;          //0 = páros oldal-even; 1 = páratlan oldal -Odd
    private int siteLength;
    private FenceCondition fenceCondition;

    public Site(int addressParity, int siteLength, FenceCondition fenceCondition) {
        this.addressParity = addressParity;
        this.siteLength = siteLength;
        this.fenceCondition = fenceCondition;
    }

    public int getAddressParity() {
        return addressParity;
    }

    public int getSiteLength() {
        return siteLength;
    }

    public FenceCondition getFenceCondition() {
        return fenceCondition;
    }

}