package com.machinetest.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "categories")
public class category {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String name;

	    @OneToMany
	    private List<product> products;

		public category() {
			super();
			// TODO Auto-generated constructor stub
		}

		public category(Long id, String name, List<product> products) {
			super();
			this.id = id;
			this.name = name;
			this.products = products;
		}

		@Override
		public String toString() {
			return "category [id=" + id + ", name=" + name + ", products=" + products + "]";
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<product> getProducts() {
			return products;
		}

		public void setProducts(List<product> products) {
			this.products = products;
		}
}
