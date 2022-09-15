package com.storemanagement.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="Product")
public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long product_id;
	@Column(nullable = false)
	private String product_name;
	@Column(nullable =false)
	private int price;
	@Column(nullable =false)
	private Date mfg;
	@Column(nullable =false)
	private Date exp;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch= FetchType.EAGER  )
	 @JoinColumn(name= "id", referencedColumnName = "id")
	@JsonBackReference
	private Customer customer;
	
	
}
