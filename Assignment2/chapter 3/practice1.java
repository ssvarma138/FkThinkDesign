interface Circle{
    public double diameter();
}
class Wheel implements Circle{

    double tyre,rim;
    public Wheel(double rim,double tyre){
        this.rim = rim;
        this.tyre = tyre;
    }

    public double diameter()
    {
        return rim+tyre*2;
    }

    public double circumference()
    {
        return diameter()* Math.PI;
    }

}

class Gear {
    private double chainring,cog;
    public void setChainring(double chainring){
        this.chainring = chainring;
    }

    public void setCog(double cog){
        this.cog = cog;
    }


    public double getChainring() {
     return this.chainring; 
    }
    public double getCog() { 
        return this.cog; 
    }


    public Gear(double chainring, double cog)
    {
        setChainring(chainring);
        setCog(cog);
    }

    public double ratio()
    {
        return chainring/cog;
    }

    public double gearInches(Circle wheel)
    {
        return ratio()*(wheel.Diameter());
    }

}
public class practice1{
    public static void main(String[] args){

    }
}