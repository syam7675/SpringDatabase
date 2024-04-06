package com.example.SpringDatabase.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Product_details")
public class Product {
	@Id
	private int id;
	@Column(name="pro_title",nullable=false)
	private String title;
	@Column(nullable=false)
	private String description;
	@Column(nullable=false)
	private boolean status;
	
	public Product()
	{
		
	}

	public Product(int id, String title, String description, boolean status) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", description=" + description + ", status=" + status + "]";
	}
	


	

}
