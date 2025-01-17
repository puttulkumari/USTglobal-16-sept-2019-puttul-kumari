package com.ustglobal.stockmanagement.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_info")
public class OrderBean {
	
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private double  total_price;
	@Column
	private double total_price_with_gst;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public double getTotal_price_with_gst() {
		return total_price_with_gst;
	}
	public void setTotal_price_with_gst(double total_price_with_gst) {
		this.total_price_with_gst = total_price_with_gst;
	}
	

}
