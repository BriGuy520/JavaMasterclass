import interfaces.Flight;

public class Jet extends FlightEnabled implements Flight {


    @Override
    public void flyingDevice(){
        System.out.println(getClass().getSimpleName());
    }


    @Override 
    public void takeoff(){
        System.out.println("The Jet is taking off");
    }
    
     @Override 
    public void fly(){
        System.out.println("The Jet is flying in the air");
    }

     @Override 
    public void land(){
        System.out.println("The Jet is landing safely on the ground");
    }
}
