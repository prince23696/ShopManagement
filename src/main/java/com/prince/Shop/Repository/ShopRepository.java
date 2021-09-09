package com.prince.Shop.Repository;

import com.prince.Shop.Entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends CrudRepository<Product, Integer> {



}
