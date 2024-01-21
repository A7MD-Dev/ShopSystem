package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.exception.CategoryNotFoundException;
import system.model.Category;
import system.service.CategoryService;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    @GetMapping
    public List<Category> getAllCategories() {
        try {
            return categoryService.getAllCategories();
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve categories", e);
        }
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id)  {
        return categoryService.findById(id).orElseThrow(() -> new CategoryNotFoundException("Category not found with ID: " + id));
    }

}
