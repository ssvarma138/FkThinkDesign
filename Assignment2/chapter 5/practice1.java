interface Preparer{
    void prepare_trip(Trip trip);

}
class Trip {
    private int bicycle,customer, verhicle;

    public void prepares(Preparer preparer){
        preparer.prepare_trip(this);
    }

}
class Mechanic
{
    public void prepare_trip(Trip trip){
        System.out.println("Mechanic");
    }
}

class TripAdviser
{
    public void prepare_trip(Trip trip){
        System.out.println("Trip Adviser");
    }
}
public class practice1{
    public static void main(String[] args){
        
    }
}