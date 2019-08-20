package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.bean.Merchant;
import com.cg.bean.Product;

public interface ProductDAO extends JpaRepository<Product,Integer> {
	@Query("select p from Product p where p.merchant=?1")
	public Product findbymerchant(Merchant merchant);

}
