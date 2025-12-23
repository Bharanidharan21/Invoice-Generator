package com.project.app.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class InvoiceItemDto {
   private long id;
   private String description;
   private Integer quantity;
   private double unitprice;
   private double total;
   public long getId() {
	return id;
   }
   public void setId(long id) {
	this.id = id;
   }
   public String getDescription() {
	return description;
   }
   public void setDescription(String description) {
	this.description = description;
   }
   public Integer getQuantity() {
	return quantity;
   }
   public void setQuantity(Integer quantity) {
	this.quantity = quantity;
   }
   public double getUnitprice() {
	return unitprice;
   }
   public void setUnitprice(double unitprice) {
	this.unitprice = unitprice;
   }
   public double getTotal() {
	return total;
   }
   public void setTotal(double total) {
	this.total = total;
   }
	
}

