package com.hassan;
// Generated Jan 10, 2023, 9:43:47 PM by Hibernate Tools 6.1.6.Final



import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.sql.Date;

/**
 * Person generated by hbm2java
 */

@Table(name="person"
    ,catalog="inheritance3"
)
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="person_type")
public abstract class Person  implements java.io.Serializable {


     protected Integer id;
     protected String firstName;
     protected String lastName;

    public Person() {
    }

	
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="first_name", nullable=false, length=50)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="last_name", nullable=false, length=50)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    




}


