import java.util.HashMap;

class Gear{
    private double chainring,cog,rim,tyre;
    private Wheels wheel;

    public Gear(double chainring, double cog, double rim, double tyre){
        this.chainring = chainring;
        this.rim = rim;
        this.cog = cog;
        this.tyre = tyre;
        wheel = new Wheels(rim,tyre);
    }

    public double ratio(){
        return chainring/cog;
    }
    public double getGearInches(){
        return ratio()*diameter();
    }

    public double diameter(){
        return wheel.getDiameter();
    }

}

 class something
{
    public something(HashMap<String,Double> args){
        Gear obj = new Gear(args.get("chainring"),args.get("cog"),args.get("rim"),args.get("tyre"));
    }

}
public class practice3{
    public static void main(String[] args){
        
    }
}