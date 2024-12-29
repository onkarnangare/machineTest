package com.machinetest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.machinetest.entity.product;
import com.machinetest.service.productservice;

@RestController
@RequestMapping("/api/products")


public class productcontroller {
	@Autowired
	productservice service;
	
	@GetMapping("/getallproduct")
	public List<product>getallproduct(){
		return service.getallproduct();
	}
	@PostMapping("/save")
	public List<product> insertproduct(@RequestBody List<product> b) {
		return service.insertproduct(b);
	}
	@GetMapping("/getbyid/{id}")
	public product getbyid(@PathVariable  int id ) {
		return service.getbyid(id);
		
	}
	@PutMapping("/updatecategory")
	public String updatecategory(@RequestBody product b) {
		return service.updateproduct(b);
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deletebyid(@PathVariable int id) {
		return service.deletebyid(id);
		
	}

}
