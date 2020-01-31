class Gear{
    double chainring,cog,rim,tyre;
    public Gear(double chainring,double cog,double rim,double tyre){
        this.chainring = chainring;
        this.cog = cog;
        this.rim = rim;
        this.tyre = tyre;
    }
    public double ratio(){
        return chainring/cog;
    }
    public double gearInches(){
        return ratio()*(rim+tyre*2);
    }

}
public class practice2{
    public static void main(String[] args){
        System.out.println(new Gear(52,11,26,1.5).gearInches());
        System.out.println(new Gear(52,11,24,1.25).gearInches());
    }
}