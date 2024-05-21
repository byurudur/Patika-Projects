package han.batu.librarymanagementapp.business.concretes;

import han.batu.librarymanagementapp.entities.Publisher;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherServices {
    Publisher save(Publisher publisher);
    Publisher update(Publisher publisher);
    Publisher getId(long id);
    Page<Publisher> cursor(int page, int pageSize);
    boolean delete(long id);
}