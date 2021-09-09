package com.prince.Shop.Services;

import com.prince.Shop.Entity.Product;
import com.prince.Shop.Repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    ShopRepository shopRepository;

    @Override
    public List<Product> getAll() {
        return (List<Product>) shopRepository.findAll();
    }


    @Override
    public String addItem(Product product) {
        shopRepository.save(product);
        return "Item Added Successfully";
    }

    @Override
    public String updateItem(int id, Product product) {
        Product product1 = shopRepository.findById(id).get();
        product1.setPname(product.getPname());
        product1.setPrice(product.getPrice());
        shopRepository.save(product1);
        return "Item updated";
    }

    @Override
    public Product getItem(int id) {
        return shopRepository.findById(id).get();
    }

    @Override
    public String deleteItem(int id) {
        shopRepository.deleteById(id);
        return "Item Deleted id=" + id;
    }
}

