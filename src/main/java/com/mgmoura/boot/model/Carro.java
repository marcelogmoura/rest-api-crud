package com.mgmoura.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String modelo;
	private Integer ano;
}
