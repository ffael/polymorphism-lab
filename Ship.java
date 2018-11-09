/**
 * @author Rafael Ferreira;
 * CS200 - Programming II
 * Lab: Polymorphism;
 */

public abstract class Ship implements Floatable {
    /** Attributes */
    private String shipName;
    private int builtYear;

    /** Constructor Methods */
    public Ship(){
        this.shipName = "Zeus";
        this.builtYear = 1600;
    }

    public Ship(String shipName, int builtYear){
        this.shipName = shipName;
        this.builtYear = builtYear;
    }

    /** Get Methods */
    public String getShipName(){
        return this.shipName;
    }

    public int getBuiltYear(){
        return this.builtYear;
    }

    /** Set Methods */
    public void setShipName(String name){
        this.shipName = name;
    }

    public void setBuiltYear(int year){
        this.builtYear = year;
    }

    /** Method implemented from interface (Floatable)*/
    public boolean isShip() { return true; }

    /** Override toString Method */
    @Override
    public String toString(){
        return "Name: " + this.shipName + ";" + "\nYear Built: " + this.builtYear + ";";
    }

    /** Abstract Methods */
    public abstract boolean compareShips(Ship shipA, Ship shipB);
}
