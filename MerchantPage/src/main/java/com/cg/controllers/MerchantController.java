package com.cg.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Merchant;
import com.cg.bean.Product;
import com.cg.exception.MerchantNotFoundException;
import com.cg.exception.ProductNotFoundException;
import com.cg.service.MerchantServiceImpl;
@CrossOrigin(origins= "http://localhost:4200/")
@RestController

public class MerchantController {
	
@Autowired MerchantServiceImpl service;

//	@PutMapping(value="/inventoryControl", consumes= {"application/json"})
//	public String create(@RequestBody Product ob) {
//	service.addAccount(ob);
//	return "Account created!!";
//	}
//	
//	@PutMapping(value="/update/{mobile}", consumes= {"application/json"})
//	public String update(@RequestBody Account ob) {
//		
//		//Account ac = service.findAccount(mobile);
//		System.out.println(ob);
//	service.updateAccount(ob);
//	return "Account updated!!";
//	}
//	@DeleteMapping(value="/delete/{mobile}")
//	public String delete(@PathVariable long mobile) {
//		service.deleteAccount(mobile);
//		return "Account deleted";
//	}
	@GetMapping(value="/inventoryControl/{mid}")
	public  List<Product> find(@PathVariable int mid) {
		List<Product> li = service.showProducts(mid);
		return li;
	}
	
	@GetMapping(value="/merchantprofile/{mid}")
	public Merchant findMerchant(@PathVariable int mid) {
		Merchant mer=service.getMerchantdetails(mid);
		return mer;
	}
	

//======================================================Product details================================================


@PostMapping(value="/products/add", consumes= {"application/json"})
public int addProduct(@RequestBody Product product) throws ProductNotFoundException {
	product.setReleaseDate(new Date(2019,8,24));
	service.addProduct(product);
	return 0;
}
@PutMapping(value="/products/update", consumes= {"application/json"})
public Product updateProduct(@RequestBody Product product) {
	try {
		service.updateProduct(product);
		return product;
	}catch(Exception e) {
		return null;
	}
}

@GetMapping(value="products/getmerchantbyid/{merchantId}") 
public Merchant getMerchantById(@PathVariable("merchantId") Integer merchantId) throws MerchantNotFoundException {
	return service.getMerchantById(merchantId);
}


@GetMapping(value="products/all/{merchantId}")
public @ResponseBody List<Product> getAllProduct(@PathVariable("merchantId") int merchantId) {
	System.out.println("Hello");
	System.out.println(merchantId);
	List<Product> product = service.getAllProducts(merchantId);
	return product;
}

}













