package dao;
// Generated Feb 11, 2023, 2:29:51 PM by Hibernate Tools 6.1.6.Final


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * DeptEmpLatestDate generated by hbm2java
 */
@Entity
@Table(name="dept_emp_latest_date"
    ,catalog="employees"
)
public class DeptEmpLatestDate  implements java.io.Serializable {


     private DeptEmpLatestDateId id;

    public DeptEmpLatestDate() {
    }

    public DeptEmpLatestDate(DeptEmpLatestDateId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="empNo", column=@Column(name="emp_no", nullable=false) ), 
        @AttributeOverride(name="fromDate", column=@Column(name="from_date", length=10) ), 
        @AttributeOverride(name="toDate", column=@Column(name="to_date", length=10) ) } )
    public DeptEmpLatestDateId getId() {
        return this.id;
    }
    
    public void setId(DeptEmpLatestDateId id) {
        this.id = id;
    }




}

