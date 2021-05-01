package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity 
@Table(name="sales")
public class Sale {




	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long nSale;
	
	private Long userId;
	
	@Size(min=4, max=200)
	private String descripcion;
	@Max(200000)
	@Min(1)
	private Integer total;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
	
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    
    public Sale() {
    }
    
	public Sale(Long nSale, @Size(min = 4, max = 50) Long userId, @Size(min = 4, max = 200) String descripcion,
			@Max(200000) @Min(1) Integer total, Date createdAt, Date updatedAt) {
		super();
		this.nSale = nSale;
		this.userId = userId;
		this.descripcion = descripcion;
		this.total = total;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
    
	public Long getnSale() {
		return nSale;
	}

	public void setnSale(Long nSale) {
		this.nSale = nSale;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
