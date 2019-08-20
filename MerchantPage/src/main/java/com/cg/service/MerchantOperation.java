package com.cg.service;

import java.util.List;

import com.cg.bean.Merchant;
import com.cg.bean.Product;
import com.cg.exception.MerchantNotFoundException;
import com.cg.exception.ProductNotFoundException;

public interface MerchantOperation {
	 public List<Product> showProducts(int mid);
	 public Merchant getMerchantdetails(int id);
	// =======================================product details======================================
	 public Merchant getMerchantById(int merchantId) throws MerchantNotFoundException;
		public Integer addProduct(Product product) throws ProductNotFoundException;	
		public List<Product> getAllProducts(int merchantId);	
		public void updateProduct(Product product)throws ProductNotFoundException;
		public Product getProductDetails(int productId) throws ProductNotFoundException;
		public void removeProduct(int productId) throws ProductNotFoundException;

	
}
