package dao;
// Generated Feb 11, 2023, 2:29:51 PM by Hibernate Tools 6.1.6.Final


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.sql.Date;

/**
 * Titles generated by hbm2java
 */
@Entity
@Table(name="titles"
    ,catalog="employees"
)
public class Titles  implements java.io.Serializable {


     private TitlesId id;
     private Date toDate;

    public Titles() {
    }

	
    public Titles(TitlesId id) {
        this.id = id;
    }
    public Titles(TitlesId id, Date toDate) {
       this.id = id;
       this.toDate = toDate;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="empNo", column=@Column(name="emp_no", nullable=false) ), 
        @AttributeOverride(name="fromDate", column=@Column(name="from_date", nullable=false, length=10) ), 
        @AttributeOverride(name="title", column=@Column(name="title", nullable=false, length=50) ) } )
    public TitlesId getId() {
        return this.id;
    }
    
    public void setId(TitlesId id) {
        this.id = id;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="to_date", length=10)
    public Date getToDate() {
        return this.toDate;
    }
    
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }




}


