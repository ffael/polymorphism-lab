/**
 * @author Rafael Ferreira;
 * CS200 - Programming II
 * Lab: Polymorphism;
 */

import java.util.ArrayList;

public class ShipTester {
    public static void main(String[] args){

        /** Declare and Initiate Ship Objects */
        // Cargo Ships
        Ship cargoA = new CargoShip("Cargo A", 2000,2000);
        Ship cargoB = new CargoShip("Cargo B", 1992,1000);
        Ship cargoC = new CargoShip("Cargo C", 1994,1200);
        Ship cargoD = new CargoShip("Cargo D", 1980,1500);

        // Cruise Ship
        Ship cruiseA = new CruiseShip("Cruise A", 2005,500);
        Ship cruiseB = new CruiseShip("Cruise B", 1987,300);
        Ship cruiseC = new CruiseShip("Cruise C", 1999,1500);
        Ship cruiseD = new CruiseShip("Cruise D", 2002,750);

        /** Add Ships to dock ArrayList */
        ArrayList<Ship> dock = new ArrayList<Ship>(){{
            add(cargoA);
            add(cargoB);
            add(cargoC);
            add(cargoD);
            add(cruiseA);
            add(cruiseB);
            add(cruiseC);
            add(cruiseD);
        }};

        /** Print Dock Information and Ship Information*/
        System.out.println("Dock Information:\n");

        for(Ship ship: dock){
            System.out.println("Ship's Info:\n" + ship.toString());
            System.out.println("Is a Ship?: " + ship.isShip());
            System.out.println();
        }

        /** Compare Ships for the Same Builder Company */
        System.out.println(dock.get(0).compareShips( dock.get(0) , dock.get(7)));
        System.out.println(dock.get(4).compareShips( dock.get(1) , dock.get(6)));
        System.out.println(dock.get(2).compareShips( dock.get(2) , dock.get(5)));
        System.out.println(dock.get(1).compareShips( dock.get(3) , dock.get(4)));

    }
}
