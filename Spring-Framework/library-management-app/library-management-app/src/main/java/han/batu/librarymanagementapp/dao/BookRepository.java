package han.batu.librarymanagementapp.dao;

import han.batu.librarymanagementapp.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
}
