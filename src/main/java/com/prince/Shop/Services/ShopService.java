package com.prince.Shop.Services;

import com.prince.Shop.Entity.Product;

import java.util.List;

public interface ShopService {

    public List<Product> getAll();

    public Product getItem(int id);

    public String addItem(Product product);

    public String updateItem(int id,Product product);

    public String deleteItem(int id);

}
