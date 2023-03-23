package iti.jets;

import java.sql.Date;

import jakarta.persistence.*;
// import javax.persistence.Entity;
// import javax.persistence.Id;
// import javax.persistence.Table;

@Entity
@Table(name = "actor")
class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actor_id;
    private String first_name;
    private String last_name;
    private Date last_update;

    Actor(){
    }

    Actor(String first_name, String last_name, Date last_update) {
        // this.actor_id = actor_id ;
        this.last_update = last_update;
        this.last_name = last_name;
        this.first_name = first_name;
    }

    public void getActorName(){
        System.out.println(first_name);
    } 
}

public class App {

    private static EntityManager em;

    public static void createActor(String first_name, String last_name, Date last_update) {
        em.getTransaction().begin();
        Actor actor = new Actor(first_name, last_name, last_update);
        em.persist(actor);
        em.getTransaction().commit();
        em.close();
    }

    public static Actor find(int actor_id){
        em.getTransaction().begin();
        Actor actor =  em.find(Actor.class , actor_id );
        em.getTransaction().commit();
        em.close();
        return actor ;
    }


    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sakilaDB");
        em = emf.createEntityManager();
        // createActor("hussien", "mohamed", Date.valueOf(java.time.LocalDate.now()));
         Actor result =  find(20);
        result.getActorName();
        System.out.println("Done : Added");
    }
}
