package han.batu.librarymanagementapp.business.abstracts;

import han.batu.librarymanagementapp.business.concretes.BookServices;
import han.batu.librarymanagementapp.dao.BookRepository;
import han.batu.librarymanagementapp.entities.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookManager implements BookServices {
    private final BookRepository bookRepository;
    @Override
    public Book save(Book Book) {
        return null;
    }

    @Override
    public Book update(Book Book) {
        return null;
    }

    @Override
    public Book getId(long id) {
        return null;
    }

    @Override
    public Page<Book> cursor(int page, int pageSize) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}