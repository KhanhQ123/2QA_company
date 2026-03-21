package phattrienungdungvoij2ee.bai5_qlsp_jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import phattrienungdungvoij2ee.bai5_qlsp_jpa.model.Category_Dichvu;
import phattrienungdungvoij2ee.bai5_qlsp_jpa.service.CategoryDichvuService;

@Controller
@RequestMapping("/service-categories")
public class CategoryDichvuController {

    @Autowired
    private CategoryDichvuService categoryDichvuService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("serviceCategories", categoryDichvuService.getAllCategories());
        return "service-category/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("serviceCategory", new Category_Dichvu());
        return "service-category/add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("serviceCategory") Category_Dichvu category,
                       RedirectAttributes redirectAttributes) {
        try {
            categoryDichvuService.saveCategory(category);
            redirectAttributes.addFlashAttribute("successMsg", "Luu nhom dich vu thanh cong!");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("errorMsg", "Luu nhom dich vu that bai: " + e.getMessage());
        }
        return "redirect:/service-categories";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model,
                               RedirectAttributes redirectAttributes) {
        Category_Dichvu category = categoryDichvuService.getCategoryById(id);
        if (category == null) {
            redirectAttributes.addFlashAttribute("errorMsg", "Khong tim thay nhom dich vu.");
            return "redirect:/service-categories";
        }
        model.addAttribute("serviceCategory", category);
        return "service-category/edit";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
        try {
            categoryDichvuService.deleteCategory(id);
            redirectAttributes.addFlashAttribute("successMsg", "Xoa nhom dich vu thanh cong!");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("errorMsg", "Xoa nhom dich vu that bai: " + e.getMessage());
        }
        return "redirect:/service-categories";
    }
}
