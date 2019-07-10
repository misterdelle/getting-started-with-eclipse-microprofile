package de.rieckpil.udemy.qualifiers;

@ShipDistributor
public class BookShipDistributor implements BookDistributor {

    @Override
    public void distributeBook(String bookName) {
        System.out.println("Distributing book by ship");
    }
}
