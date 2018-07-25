package pl.akademiakodu.sklep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.sklep.dao.CategoryDao;
import pl.akademiakodu.sklep.dao.ProductDao;
import pl.akademiakodu.sklep.model.Product;


@Controller
public class ProductController {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/product/add")
    public String add(ModelMap modelMap){
        modelMap.put("product",new Product());
        modelMap.put("categories",categoryDao.findAll());
        return"product/add";
    }

    @PostMapping("product/add")
    public String save(@ModelAttribute Product product)
    {
    productDao.save(product);
    return "product/show";
    }
    @PostMapping ("product/all")
    public String all(@ModelAttribute Product product)
    {
        productDao.findAll();
        return "product/all";
    }

}
