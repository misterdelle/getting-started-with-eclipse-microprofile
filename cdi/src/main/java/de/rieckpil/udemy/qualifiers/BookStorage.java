package de.rieckpil.udemy.qualifiers;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

@ApplicationScoped
public class BookStorage {

    @Inject
    private Instance<BookDistributor> bookDistributors;

    @Inject
    @PlaneDistributor
    private BookDistributor bookPlaneDistributor;

    @Inject
    @ShipDistributor
    private BookDistributor bookShipDistributor;

    @PostConstruct
    public void init() {
        this.distributeBookToCustomer("Java for Beginners");
    }

    public void distributeBookToCustomer(String bookName) {
        bookDistributors.forEach(b -> b.distributeBook(bookName));
        bookPlaneDistributor.distributeBook(bookName);
        bookShipDistributor.distributeBook(bookName);
    }

}