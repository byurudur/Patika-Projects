package han.batu.librarymanagementapp.dao;

import han.batu.librarymanagementapp.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
