package com.jpa.lab2;

import java.util.*;

// import org.hibernate.collection.spi.PersistentSet;

import com.jpa.lab2.dao.*;
import jakarta.persistence.*;

public class App {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("lab2");
    EntityManager em = emf.createEntityManager();

    User hassan = new User("hassan@email.com", "14st wadi_houf", new Date(), "hassan", "myPassword");
    User sherif = new User("sherif@email.com", "14st wadi_houf", new Date(), "Sherif", "myPassword2");
    Category clothes = new Category("clothes", "all clothes", new HashSet<Product>(0));
    Category mobile = new Category("mobiles", "all mobiles", new HashSet<Product>(0));
    Seller seller1 = new Seller(hassan, "hassan is a seller");
    Buyer buyer1 = new Buyer(sherif, "sherif is a buyer");
    Product product1 = new Product(seller1, "t-shirt", "desc for tshirt", "H&M", new Date(), new Date(), 5, new Date(),
            new Date(), new HashSet<Category>(Arrays.asList(clothes, mobile)));

    public void insertUser() {
        em.getTransaction().begin();
        em.persist(hassan);
        em.persist(sherif);
        em.getTransaction().commit();
    }

    public void insertCatigory() {
        em.getTransaction().begin();
        em.persist(clothes);
        em.persist(mobile);
        em.getTransaction().commit();
    }

    public void insertSeller() {
        em.getTransaction().begin();
        em.persist(seller1);
        em.getTransaction().commit();
    }

    public void insertBuyer() {
        em.getTransaction().begin();
        em.persist(buyer1);
        em.getTransaction().commit();
    }

    public void insertProduct() {
        em.getTransaction().begin();
        em.persist(product1);
        em.getTransaction().commit();
    }

    public void insertBuyerBuyProduct() {
        BuyerBuyProductId bbpi = new BuyerBuyProductId(buyer1.getId(), product1.getId());
        BuyerBuyProduct buyProduct = new BuyerBuyProduct(bbpi, buyer1, product1, new Date(), 100, 5);
        em.getTransaction().begin();
        em.persist(buyProduct);
        em.getTransaction().commit();
    }
    public void insertBuyerBidProduct() {
        BuyerBidProductId bbpi = new BuyerBidProductId(buyer1.getId(), product1.getId());
        BuyerBidProduct buyProduct = new BuyerBidProduct(bbpi, buyer1, product1, new Date(), 100, 5);
        em.getTransaction().begin();
        em.persist(buyProduct);
        em.getTransaction().commit();
    }

    public static void main(String[] args) {

        App insatnce = new App();
        insatnce.insertUser();
        insatnce.insertCatigory();
        insatnce.insertSeller();
        insatnce.insertBuyer();
        insatnce.insertProduct();
        insatnce.insertBuyerBuyProduct();
        insatnce.insertBuyerBidProduct();

    }
}
