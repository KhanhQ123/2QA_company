package phattrienungdungvoij2ee.bai5_qlsp_jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phattrienungdungvoij2ee.bai5_qlsp_jpa.model.Category_Dichvu;
import phattrienungdungvoij2ee.bai5_qlsp_jpa.repository.CategoryDichvuRepository;

import java.util.List;

@Service
public class CategoryDichvuService {
    @Autowired
    private CategoryDichvuRepository categoryDichvuRepository;

    public List<Category_Dichvu> getAllCategories() {
        return categoryDichvuRepository.findAll();
    }

    public Category_Dichvu getCategoryById(Long id) {
        return categoryDichvuRepository.findById(id).orElse(null);
    }

    public void saveCategory(Category_Dichvu category) {
        categoryDichvuRepository.save(category);
    }

    public void deleteCategory(Long id) {
        categoryDichvuRepository.deleteById(id);
    }
}
