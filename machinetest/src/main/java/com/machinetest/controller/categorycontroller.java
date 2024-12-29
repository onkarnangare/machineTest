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

import com.machinetest.entity.category;
import com.machinetest.service.categoryservice;


@RestController
@RequestMapping("/api/categories")
public class categorycontroller {
	
	@Autowired
	categoryservice service;
	
	@GetMapping("/getallcategory")
	public List<category>getallcategory(){
		return service.getallcategory();
	}
	@PostMapping("/save")
	public List<category> insertcategory(@RequestBody List<category> b) {
		return service.insertcategory(b);
	}
	@GetMapping("/getbyid/{id}")
	public category getbyid(@PathVariable  int id ) {
		return service.getbyid(id);
		
	}
	@PutMapping("/updatecategory")
	public String updatecategory(@RequestBody category b) {
		return service.updatcategory(b);
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deletebyid(@PathVariable int id) {
		return service.deletebyid(id);
		
	}

}
