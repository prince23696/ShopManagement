package com.prince.Shop.Controller;

import com.prince.Shop.Entity.Product;
import com.prince.Shop.Services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopController {

    @Autowired
    ShopService shopService;

    @GetMapping("/home")
    public String demo() {
        return " this is demo get api";
    }

    @GetMapping("getProduct/{id}")
    public Product getItem(@PathVariable int id) {
        Product product = shopService.getItem(id);
        return product;
    }

    @GetMapping("/getProducts")
    public List<Product> getAll() {
        return shopService.getAll();
    }

    @PostMapping("/save")
    public Product addItem(@RequestBody Product product) {
        shopService.addItem(product);
        return product;
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteItem(@PathVariable int id) {
        shopService.deleteItem(id);
        return "item deleted form database id-" + id;
    }
    @PutMapping("/update/{id}")
    public Product updateItem(@PathVariable int id, @RequestBody Product product) {
        shopService.updateItem(id ,product);
        return product;
    }

}

