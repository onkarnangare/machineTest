package machinetest.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import machinetest.springboot.entity.Category;
import machinetest.springboot.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	public Page<Category> getAllCategories(Pageable pageable) {
		return categoryRepository.findAll(pageable);
	}

	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}

	public Category getCategoryById(Long id) {
		return categoryRepository.findById(id).orElse(null);
	}

	public Category updateCategory(Long id, Category category) {
		Category existingCategory = getCategoryById(id);
		if (existingCategory != null) {
			existingCategory.setName(category.getName());
			return categoryRepository.save(existingCategory);
		}
		return null;
	}

	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}
}
