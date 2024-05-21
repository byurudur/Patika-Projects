package han.batu.librarymanagementapp.business.abstracts;
import han.batu.librarymanagementapp.business.concretes.PublisherServices;
import han.batu.librarymanagementapp.dao.PublisherRepository;
import han.batu.librarymanagementapp.entities.Publisher;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class PublisherManager implements PublisherServices {
    private final PublisherRepository publisherRepository;
    @Override
    public Publisher save(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    @Override
    public Publisher update(@NotNull Publisher publisher) {
        getId(publisher.getId());
        return publisherRepository.save(publisher);
    }

    @Override
    public Publisher getId(long id) {
        return null;
    }

    @Override
    public Page<Publisher> cursor(int page, int pageSize) {
        return publisherRepository.findAll(PageRequest.of(page,pageSize));
    }

    @Override
    public boolean delete(long id) {
        publisherRepository.delete(getId(id));
        return true;
    }
}
