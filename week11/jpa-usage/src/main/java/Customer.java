import jakarta.persistence.*;

import java.time.LocalDate;

@Entity // Declaration of identity
@Table(name = "customers") // Declaring of which table of Market database.
public class Customer {
    @Id // Declaration of ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identity = Is a primary key.
    @Column(name = "customer_id", columnDefinition = "serial") // Increases by 1 as created serial number. ( Auto-Incrementation)
    private int id; // customer_id
    @Column(name = "customer_name", length = 100, nullable = false) // Cannot be null.
    private String name; // customer_name

    @Column(name = "customer_mail", unique = true, nullable = false ) // Unique, only one usage


    private String mail;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    @Enumerated(EnumType.STRING) // Represents an enumerated class, formatted as String on database.
    @Column(name = "customer_gender")
    private GENDER gender;
    public enum GENDER{
        MALE,
        FEMALE
    }


    @Column(name = "customer_on_date")
    @Temporal(TemporalType.DATE)
    private LocalDate onDate;

    public LocalDate getOnDate() {
        return onDate;
    }

    public void setOnDate(LocalDate onDate) {
        this.onDate = onDate;
    }

    public Customer(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id = " + id +
                " , name = '" + name + '\'' +
                " , mail = '" + mail + '\'' +
                " , gender = " + gender +
                " , onDate = " + onDate +
                '}';
    }
}
