package us.digitalasylum.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Person
{
    private Integer id = null;
    private String firstName = null;
    private String lastName = null;

    private Date created = null;

    /**
     * Gets id (primary key).
     */
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    /**
     * Sets id (primary key).
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    /**
     * Gets date created.
     */
    public Date getCreated() {
        return created;
    }

    /**
     * Sets date created.
     */
    public void setCreated(Date created) {
        this.created = created;
    }
    
    
    public Person(Integer id, String fName, String lName, Date date){
      this.id = id;
      this.firstName = fName;
      this.lastName = lName;
      this.created = date;  
    }
}