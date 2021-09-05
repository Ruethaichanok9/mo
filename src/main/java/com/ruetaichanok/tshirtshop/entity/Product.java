package com.ruetaichanok.tshirtshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="no112product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	
	@Column(name="no112productname")
	public String no112productname;
	
	@Column(name="no112productdescription")
	public String no112productdescription;
	
	@Column(name="no112productprice")
	public double no112productprice;
	
	@Column(name="no112productimage")
	public String no112productimage;
	
	public Product() {}

	public Product(int id, String no112productname, String no112productdescription, double no112productprice,
			String no112productimage) {
		super();
		this.id = id;
		this.no112productname = no112productname;
		this.no112productdescription = no112productdescription;
		this.no112productprice = no112productprice;
		this.no112productimage = no112productimage;
	}
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNo112productname() {
		return no112productname;
	}



	public void setNo112productname(String no112productname) {
		this.no112productname = no112productname;
	}



	public String getNo112productdescription() {
		return no112productdescription;
	}



	public void setNo112productdescription(String no112productdescription) {
		this.no112productdescription = no112productdescription;
	}



	public double getNo112productprice() {
		return no112productprice;
	}



	public void setNo112productprice(double no112productprice) {
		this.no112productprice = no112productprice;
	}



	public String getNo112productimage() {
		return no112productimage;
	}



	public void setNo112productimage(String no112productimage) {
		this.no112productimage = no112productimage;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", no112productname=" + no112productname + ", no112productdescription="
				+ no112productdescription + ", no112productprice=" + no112productprice + ", no112productimage="
				+ no112productimage + "]";
	}
	
	
}
