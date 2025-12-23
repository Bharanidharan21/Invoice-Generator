package com.project.app.dto;

import java.time.LocalDateTime;

import com.project.app.entity.PaymentMethod;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PaymentDto {
	private Long id;
    private Long invoiceId;
    private LocalDateTime paymentDate;
    private Double amount;
    private PaymentMethod method;
    private String reference;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public PaymentMethod getMethod() {
		return method;
	}
	public void setMethod(PaymentMethod method) {
		this.method = method;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
    
}
