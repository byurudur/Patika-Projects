package han.batu.librarymanagementapp.business.concretes;

import han.batu.librarymanagementapp.entities.Author;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorServices {
    Author save(Author author);
    Author update(Author author);
    Author getId(long id);
    Page<Author> cursor(int page, int pageSize);
    boolean delete(long id);
}