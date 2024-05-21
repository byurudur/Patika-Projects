package han.batu.librarymanagementapp.business.concretes;


import han.batu.librarymanagementapp.entities.BookBorrowing;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

@Repository
public interface BookBorrowingServices {
    BookBorrowing save(BookBorrowing bookBorrowing);
    BookBorrowing update(BookBorrowing bookBorrowing);
    BookBorrowing getId(long id);
    Page<BookBorrowing> cursor(int page, int pageSize);
    boolean delete(long id);
}