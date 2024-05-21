package han.batu.librarymanagementapp.dao;

import han.batu.librarymanagementapp.entities.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookBorrowingRepository extends JpaRepository<BookBorrowing, Long> {
}
