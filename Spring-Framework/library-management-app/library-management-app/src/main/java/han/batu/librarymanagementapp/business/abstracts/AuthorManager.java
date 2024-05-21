package han.batu.librarymanagementapp.business.abstracts;


import han.batu.librarymanagementapp.business.concretes.AuthorServices;
import han.batu.librarymanagementapp.dao.AuthorRepository;
import han.batu.librarymanagementapp.entities.Author;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorManager implements AuthorServices {
    private final AuthorRepository authorRepository;
    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author update(Author author) {
        getId(author.getId());
        return authorRepository.save(author);
    }

    @Override
    public Author getId(long id) {
        return null;
    }

    @Override
    public Page<Author> cursor(int page, int pageSize) {
        return authorRepository.findAll(PageRequest.of(page,pageSize));
    }

    @Override
    public boolean delete(long id) {
        authorRepository.delete(getId(id));
        return true;
    }
}