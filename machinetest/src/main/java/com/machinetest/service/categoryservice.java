package com.machinetest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.machinetest.dao.categorydao;
import com.machinetest.entity.category;



@Service
public class categoryservice {
	@Autowired
	categorydao dao;
	
	public List<category>getallcategory(){
		return dao.getallcategory();
		
	}

	public List<category> insertcategory(List<category> b) {
		// TODO Auto-generated method stub
		return dao.insertcategory(b);
		
	}

	public category getbyid(int id) {
		// TODO Auto-generated method stub
		return dao.getbyid(id);
	}
	public String updatcategory(category b) {
		// TODO Auto-generated method stub
		return dao.updatcategory(b);
	}

	public String deletebyid(int id) {
		// TODO Auto-generated method stub
		return dao.deletebyid(id);
	}

}
