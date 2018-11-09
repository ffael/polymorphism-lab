# Due: Nov. 9 2018

For this lab you will write an application that uses inheritance and interfaces concepts.

Write an interface called Floatable, which has one public static constant for the name of the company and a method called isShip, which returns a boolean value.

Write an abstract class called Ship, which has two attributes: one for the name of the ship and another for the year the ship object was built.

Ship implements Floatable, where the isShip method returns true, since the object is of type Ship (which means Ship or any subclass of Ship should return true).

Ship implementation also includes: the constructor, accessor and mutator methods, toString methods.
It also has the compareShips method as an abstract method, which compares this ship with a given Ship object to see if they are built by the same company.

Then write two concrete classes called CruiseShip and CargoShip, such that:

CruiseShip has a field for maximum number of passengers.
It implements constructors and other methods as appropriate for this class, being a subclass of Ship. It overrides  appropriate methods of Ship.

CargoShip has a field for the cargo capacity in tonnage (int) and implements constructors and other methods as appropriate for this class, being a subclass of Ship. It overrides appropriate methods of Ship.

Write a tester that has an ArrayList of Ship objects and

•   Creates various CruiseShip and CargoShip objects and adds them to the ArrayList

•   Calls appropriate method to compare two different objects in the arraylist

•   Calls toString on all of the objects (use a for-each loop)
