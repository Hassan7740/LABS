package dao;
// Generated Jan 10, 2023, 10:30:42 PM by Hibernate Tools 6.1.6.Final


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.sql.Date;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Teacher generated by hbm2java
 */
@Entity
@Table(name="teacher"
    ,catalog="inheritance4"
)
public class Teacher  implements java.io.Serializable {


     private int id;
     private Person person;
     private Date hireDate;

    public Teacher() {
    }

    public Teacher(Person person, Date hireDate) {
       this.person = person;
       this.hireDate = hireDate;
    }
   
     @GenericGenerator(name="dao.TeacherIdGenerator", strategy="foreign", parameters=@Parameter(name="property", value="person"))@Id @GeneratedValue(generator="dao.TeacherIdGenerator")

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="hire_date", nullable=false, length=10)
    public Date getHireDate() {
        return this.hireDate;
    }
    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }




}

