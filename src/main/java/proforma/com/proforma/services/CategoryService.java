package proforma.com.proforma.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proforma.com.proforma.models.Category;
import proforma.com.proforma.repositories.CategoryRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public List<Category> getCategories() {
        List<Category> categories = categoryRepository.findAll();
        Collections.sort(categories, Comparator.comparing(Category::getId));
        return categories;
    }

    public void addCategory(Category category) {
         categoryRepository.save(category);
    }


    public Category editCategory(Category category) {
        return categoryRepository.save(category);
    }


    public void deleteCategoryById(Long id) {
        categoryRepository.deleteAllById(Collections.singleton(id));
    }

    public List<Category> getCategoriesSortedById() {
        List<Category> categories = getCategories();
        return categories.stream()
                .sorted(Comparator.comparing(Category::getId))
                .collect(Collectors.toList());
    }
}
