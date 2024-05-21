package han.batu.librarymanagementapp.dao;

import han.batu.librarymanagementapp.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
