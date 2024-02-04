package proforma.com.proforma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import proforma.com.proforma.models.Category;
import proforma.com.proforma.services.CategoryService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final String redirectUrl = "/category";
    @Autowired
    private CategoryService categoryService;

    @GetMapping("view")
    public List<Category> getCategories(){
        return categoryService.getCategories();
    }
    @GetMapping("/{id}")
    public Category text(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping( "/add")
    public void addCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
    }

    @PutMapping
    public Category edit(@RequestBody Category category){
        return categoryService.editCategory(category);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
         categoryService.deleteCategoryById(id);
    }
}
