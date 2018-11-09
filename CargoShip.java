/**
 * @author Rafael Ferreira;
 * CS200 - Programming II
 * Lab: Polymorphism;
 */

public class CargoShip extends Ship {
    /** Attributes */
    private int cargoCapacity;

    /** Constructor Methods */
    public CargoShip(){
        this.cargoCapacity = 1000;
    }
    public CargoShip(String shipName, int builtYear, int tonCapacity){
        super(shipName, builtYear);
        this.cargoCapacity = tonCapacity;
    }
    /** Get Methods */
    public int getCargoCapacity(){
        return this.cargoCapacity;
    }

    /** Set Methods */
    public void setCargoCapacity(int tonCapacity){
        this.cargoCapacity = tonCapacity;
    }

    /** Override toString Method */
    @Override
    public String toString(){
        return super.toString() + "\nCargo Capacity: " + this.cargoCapacity + " tons;";
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
