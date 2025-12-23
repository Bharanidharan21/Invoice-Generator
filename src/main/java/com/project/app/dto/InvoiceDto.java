package com.project.app.dto;

import java.time.LocalDate;

import com.project.app.entity.Status;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class InvoiceDto {
	 
	    private String invoiceNumber;
	    private LocalDate issueDate;
	    private LocalDate dueDate;
	    private Status status; // DRAFT, SENT, PAID, CANCELLED
	    private Double totalAmount;
		public String getInvoiceNumber() {
			return invoiceNumber;
		}
		public void setInvoiceNumber(String invoiceNumber) {
			this.invoiceNumber = invoiceNumber;
		}
		public LocalDate getIssueDate() {
			return issueDate;
		}
		public void setIssueDate(LocalDate issueDate) {
			this.issueDate = issueDate;
		}
		public LocalDate getDueDate() {
			return dueDate;
		}
		public void setDueDate(LocalDate dueDate) {
			this.dueDate = dueDate;
		}
		public Status getStatus() {
			return status;
		}
		public void setStatus(Status status) {
			this.status = status;
		}
		public Double getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(Double totalAmount) {
			this.totalAmount = totalAmount;
		}
	    
}
