package com.machinetest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class product {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String name;

	    private Double price;

	    @ManyToOne
	    @JoinColumn
	    private category category;

		public product() {
			super();
			// TODO Auto-generated constructor stub
		}

		public product(Long id, String name, Double price, com.machinetest.entity.category category) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.category = category;
		}

		@Override
		public String toString() {
			return "product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
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

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public category getCategory() {
			return category;
		}

		public void setCategory(category category) {
			this.category = category;
		}

}
