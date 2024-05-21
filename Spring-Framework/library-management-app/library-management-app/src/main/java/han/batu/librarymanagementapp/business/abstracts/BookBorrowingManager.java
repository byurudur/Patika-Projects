package han.batu.librarymanagementapp.business.abstracts;

import han.batu.librarymanagementapp.business.concretes.BookBorrowingServices;
import han.batu.librarymanagementapp.dao.BookBorrowingRepository;
import han.batu.librarymanagementapp.entities.BookBorrowing;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookBorrowingManager implements BookBorrowingServices {
    private final BookBorrowingRepository bookBorrowingRepository;
    @Override
    public BookBorrowing save(BookBorrowing bookBorrowing) {
        return bookBorrowingRepository.save(bookBorrowing);
    }

    @Override
    public BookBorrowing update(BookBorrowing bookBorrowing) {
        getId(bookBorrowing.getId());
        return bookBorrowingRepository.save(bookBorrowing);
    }

    @Override
    public BookBorrowing getId(long id) {
        return null;
    }

    @Override
    public Page<BookBorrowing> cursor(int page, int pageSize) {
        return bookBorrowingRepository.findAll(PageRequest.of(page,pageSize));
    }

    @Override
    public boolean delete(long id) {
        bookBorrowingRepository.delete(getId(id));
        return true;
    }
}