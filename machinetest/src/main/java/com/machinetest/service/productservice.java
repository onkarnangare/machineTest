package com.machinetest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.machinetest.dao.productdao;
import com.machinetest.entity.product;

@Service
public class productservice {
	@Autowired
	productdao dao;
	
	public List<product>getallproduct(){
		return dao.getallproduct();
		
	}

	public List<product> insertproduct(List<product> b) {
		// TODO Auto-generated method stub
		return dao.insertproduct(b);
		
	}

	public product getbyid(int id) {
		// TODO Auto-generated method stub
		return dao.getbyid(id);
	}
	public String updateproduct(product b) {
		// TODO Auto-generated method stub
		return dao.updatproduct(b);
	}

	public String deletebyid(int id) {
		// TODO Auto-generated method stub
		return dao.deletebyid(id);
	}

}
