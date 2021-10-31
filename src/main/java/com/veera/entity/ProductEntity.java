package com.veera.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "PRD_TB")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductEntity {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String desc;
	private String category;
	private double price;
}