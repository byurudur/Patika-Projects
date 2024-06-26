package han.batu.librarymanagementapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "borrowings")
public class BookBorrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrow_id",columnDefinition = "serial")
    private long id;

    @Column(name = "borrow_name",nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "borrow_date",nullable = false)
    private LocalDate date;

    @Column(name = "book_borrowing_mail")
    private String mail;

    @Temporal(TemporalType.DATE)
    @Column(name = "borrow_re_date")
    private LocalDate reDate;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "borrow_book_id",referencedColumnName = "book_id")
    private Book book;

}