class Gear{
    private double chainring,cog,rim,tyre;
    private Wheel wheel;

    public Gear(double chainring, double cog, double rim, double tyre)
    {
        this.chainring = chainring;
        this.cog = cog;
        this.rim = rim;
        this.tyre = tyre;
        wheel = new Wheel(rim,tyre);
    }

    public double ratio()
    {
        return chainring/cog;
    }

    public double getGearInches()
    {
        return ratio()*diameter();
    }
    public double diameter()
    {
        return wheel.getDiameter();
    }

}
public class practice2{
    public static void public static void main(String[] args) {
        
    }
}