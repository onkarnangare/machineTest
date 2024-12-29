package com.machinetest.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.machinetest.entity.product;



@Repository
public class productdao {
	@Autowired
	SessionFactory factory;
	
	public List<product>getallproduct(){
		Session session=factory.openSession();
		Criteria c=session.createCriteria(product.class);
		List<product>blist=c.list();
		return blist;
	}
	public List<product> insertproduct(List<product> b) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		for (product bank : b) {
            session.save(bank);
        }
		tx.commit();
		return b;
		}
	
	public product getbyid(int id){
		Session session=factory.openSession();
		product b=session.get(product.class, id);
		return b;
	}
	public String updatproduct(product b) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(b);
		tx.commit();
		return "success";
	}

	public String deletebyid(int id) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		product b1=session.get(product.class, id);
		session.delete(b1);
		tx.commit();
		return "success";
	}

}
