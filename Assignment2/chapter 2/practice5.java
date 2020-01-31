class Gear {


    private double chainring,cog;
    private Wheel wheel;

    public void setChainring(double chainring)
    {
        this.chainring = chainring;
    }

    public void setCog(double cog)
    {
        this.cog = cog;
    }

    public void setWheel(Wheel wheel)
    {
        this.wheel = wheel;
    }

    public double getChainring() { 
        return this.chainring; 
    }
    public double getCog() {
     return this.cog; 
    }
    public Wheel getWheel(){
     return this.wheel; 
   }

    public Gear(double chainring,double cog,Wheel wheel){
        setChainring(chainring);
        setCog(cog);
        setWheel(wheel);
    }

    public double ratio(){
        return chainring/cog;
    }

    public double gearInches()
    {
        return ratio()*(wheel.Diameter());
    }

}

class Wheel{
    double tyre,rim;
    public Wheel(double rim,double tyre){
        this.rim = rim;
        this.tyre = tyre;
    }
    public double diameter(){
        return rim+tyre*2;
    }
    public double circumference(){
        return Diameter()* Math.PI;
    }

}
