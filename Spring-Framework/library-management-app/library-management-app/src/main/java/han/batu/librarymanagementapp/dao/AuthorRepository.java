package han.batu.librarymanagementapp.dao;

import han.batu.librarymanagementapp.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
