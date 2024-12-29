package com.machinetest.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.machinetest.entity.category;
import com.machinetest.entity.product;


@Repository
public class categorydao {
	@Autowired
	SessionFactory factory;
	
	public List<category>getallcategory(){
		Session session=factory.openSession();
		Criteria c=session.createCriteria(category.class);
		List<category>blist=c.list();
		return blist;
	}
	public List<category> insertcategory(List<category> b) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		for (category bank : b) {
            session.save(bank);
        }
		tx.commit();
		return b;
		}
	
	public category getbyid(int id){
		Session session=factory.openSession();
		category b=session.get(category.class, id);
		return b;
	}
	public String updatcategory(category b) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(b);
		tx.commit();
		return "success";
	}
	public String deletebyid(int id) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		category b1=session.get(category.class, id);
		session.delete(b1);
		tx.commit();
		return "success";
	}

}
