/**
 * @author Rafael Ferreira;
 * CS200 - Programming II
 * Lab: Polymorphism;
 */

public class CruiseShip extends Ship {
    /** Attributes */
    private int maxPassengers;

    /** Constructor Methods */
    public CruiseShip(){
        this.maxPassengers = 100;
    }
    public CruiseShip(String shipName, int builtYear, int maxPassengers){
        super(shipName, builtYear);
        this.maxPassengers = maxPassengers;
    }

    /** Get Methods */
    public int getMaxPassengers(){
        return this.maxPassengers;
    }

    /** Set Methods */
    public void setMaxPassengers(int max){
        this.maxPassengers = max;
    }

    /** Override toString Method */
    @Override
    public String toString(){
        return super.toString() + "\nMax Passengers: " + this.maxPassengers + ";";
    }

    /** Method implemented from abstract class (Ship) */
    @Override
    public boolean compareShips(Ship shipA, Ship shipB) {
        if(shipA.BUILDER_NAME.equalsIgnoreCase(shipB.BUILDER_NAME)){
            return true;
        }
        return false;
    }
}
