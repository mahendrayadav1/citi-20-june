package com.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
@Entity
@Setter
@Getter
public class OrderVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotBlank
	private String item;
	@Min(value = 1)
	private float price;
	@NotBlank(message = "Email cannot be blank.")
	private String email;
	@Max(value = 10)
	private int quantity;
}
