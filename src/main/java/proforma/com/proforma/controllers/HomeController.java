package proforma.com.proforma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import proforma.com.proforma.services.CategoryService;
import proforma.com.proforma.models.Category;
import proforma.com.proforma.services.DataService;

import java.util.Comparator;
import java.util.stream.Collectors;

@Controller
public class HomeController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private DataService dataService;

    @GetMapping("/")
    public String home(){
        return "main";
    }
    @GetMapping("/sign-up")
    public String signUp(){
        return "sign-up";
    }
    @GetMapping("/sign-in")
    public String signIn(){
        return "sign-in";
    }

    @GetMapping("/category")
    public String category(Model model){
        model.addAttribute("categories", categoryService.getCategories());
        return "category";
    }
    @GetMapping("/table")
    public String data(Model model){
        model.addAttribute("data", dataService.getAllData());
        model.addAttribute("categories", categoryService.getCategories());
        return "data";
    }
}
