package han.batu.librarymanagementapp.business.abstracts;

import han.batu.librarymanagementapp.business.concretes.CategoryServices;
import han.batu.librarymanagementapp.dao.CategoryRepository;
import han.batu.librarymanagementapp.entities.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryManager implements CategoryServices {
    private final CategoryRepository categoryRepository;
    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category update(Category category) {
        getId(category.getId());
        return categoryRepository.save(category);
    }

    @Override
    public Category getId(long id) {
        return null;
    }

    @Override
    public Page<Category> cursor(int page, int pageSize) {
        return categoryRepository.findAll(PageRequest.of(page,pageSize));
    }

    @Override
    public boolean delete(long id) {
        categoryRepository.delete(getId(id));
        return true;
    }
}