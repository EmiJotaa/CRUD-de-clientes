package com.devmj.desafiocrud.dto;

import java.time.LocalDate;

import com.devmj.desafiocrud.entities.Client;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ClientDTO {
	
	private Long id;
	
	@Size(min=3, max=80, message="Nome precisa ter de 3 a 80 caracteres")
	@NotBlank(message= "Campo requerido")
	private String name;
	
	
	@Size(min=11, max=11, message="CPF deve conter exatamente 11 dígitos numéricos")
	@NotBlank(message= "Campo Requerido")
	private String cpf;
	
	@Positive(message="A renda deve ser positiva")
	private Double income;
	
	
	@NotNull(message = "Data de nascimento é obrigatória")
    @Past(message = "Data de nascimento deve ser no passado")
	private LocalDate birthDate;
	
	@NotNull(message = "Campo requerido")
	@Min(value = 0, message = "Número de filhos não pode ser negativo")
	private Integer children;

	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}
	
	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}	
}
