package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.Merchant;
import com.cg.bean.Product;
import com.cg.dao.MerchantDAO;
import com.cg.dao.ProductDAO;
import com.cg.exception.ProductNotFoundException;




@Service
@Transactional
public class MerchantServiceImpl implements MerchantOperation {
	@Autowired ProductDAO dao;
	@Autowired MerchantDAO dao1;
	@Autowired
	private MerchantDAO merchantRepo;

	@Autowired
	private ProductDAO productRepo;

	//@Autowired
	private Product product;

	//@Autowired
	private Merchant merchant;

//			
//		}
//		else
//			throw new ApplicationException("Account "+Mobileno+ " does-not exists!");
//	}
//
//@Transactional(propagation=Propagation.REQUIRED)
//	public void updateAccount(Account ob) {
//		// TODO Auto-generated method stub
//		Optional<Account> temp = dao.findById(ob.getMobile());
//		if(temp.isPresent()) {
//		
//			dao.save(ob);
//		}
//			else
//				throw new ApplicationException("Account "+ob.getMobile()+" didn't exists!");
//		}
//
//@Transactional(propagation=Propagation.REQUIRED)
//	public void deleteAccount(long mobile) {
//		Optional<Account> temp = dao.findById(mobile);
//		if(temp.isPresent()) {
//			dao.deleteById(mobile);
//		}
//		else
//			System.out.println("Account does-not exists");
//	}
//
//
//	
//@Transactional(readOnly=true)
//	public List<Account> getAllAccount() {
//		// TODO Auto-generated method stub
//	List<Account> acc= dao.findAll();
//	return acc;
//	}

@Override
public List<Product> showProducts(int mid) {
	List<Product> lst = dao.findAll();
	List<Product> returnProducts = new ArrayList<>();
	for(Product p :lst)
	{
		if(p.getMerchant().getMerchantId() == mid)
		{
			returnProducts.add(p);
		}
	}
	return returnProducts;
}

@Override
public Merchant getMerchantdetails(int id) {
	Merchant merchant = dao1.findById(id).get();
	return merchant;
}


//==================================================Add Products=============================================




@Override
public Merchant getMerchantById(int merchantId) {
	Optional<Merchant> box = merchantRepo.findById(merchantId);
	if(box.isPresent()) {
		Merchant merchant = box.get();
		return merchant;
	}else {
		return null;
	}
}

@Override
public Integer addProduct(Product product) throws ProductNotFoundException {
	try {
		System.out.println(product);
		productRepo.saveAndFlush(product);
		return product.getProductID();
	}catch(Exception e) {
		e.printStackTrace();
		return 0;
	}
}

@Override
public List<Product> getAllProducts(int merchantId) {
	List<Product> list = productRepo.findAll();
	list= list.stream().filter(product->{
		if(product.getMerchant().getMerchantId() == merchantId) {
			return true;
		}else {
			return false;
		}
	}).collect(Collectors.toList());
	return list;
}


@Override
public void updateProduct(Product product) throws ProductNotFoundException {
	Optional<Product> box = productRepo.findById(product.getProductID());
	if(box.isPresent()) {
		System.out.println(product);
		productRepo.save(product);
	}else {
		throw new ProductNotFoundException("product not found");
	}
}

@Override
public Product getProductDetails(int productId) throws ProductNotFoundException{
	Optional<Product> box = productRepo.findById(product.getProductID());
	if(box.isPresent()) {
		System.out.println("in service");
		return box.get();
	}else {
		throw new ProductNotFoundException("product not found");
	}
}

@Override
public void removeProduct(int productId) throws ProductNotFoundException {
	Optional<Product> box = productRepo.findById(product.getProductID());
	if(box.isPresent()) {
		productRepo.delete(box.get());
	}else {
		throw new ProductNotFoundException("product not found");
	}
}


}
