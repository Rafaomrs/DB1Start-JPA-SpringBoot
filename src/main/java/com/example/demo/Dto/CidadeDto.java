package com.example.demo.Dto;

import com.example.demo.domain.entity.Estado;

public class CidadeDto {
	
	private long id;
	
	private String nome;
	
	private Estado uf;
	
	
	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setUf(Estado uf) {
		this.uf = uf;
	}
	public Estado getUf() {
		return uf;
	}
}
