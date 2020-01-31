class Gear{

    double chainring,cog;

     Gear(double chainring,double cog)
    {
        this.chainring = chainring;
        this.cog = cog;
    }

    public double ratio()
    {
        return chainring/cog;

    }

}
public class practice1{
    public static void main(String[] args){
        System.out.println(new Gear(52,11).ratio());
        System.out.println(new Gear(30,27).ratio());
    }
}