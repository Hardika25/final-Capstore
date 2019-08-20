package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bean.Merchant;


public interface MerchantDAO extends JpaRepository<Merchant,Integer>{

}
