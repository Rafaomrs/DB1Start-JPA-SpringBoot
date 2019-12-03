package com.example.demo.adapter;

import com.example.demo.Dto.EstadoDto;
import com.example.demo.domain.entity.Estado;

public class EstadoAdapter {

	
	public static EstadoDto transformaEntidadeParaDto(Estado estado) {
		EstadoDto dto = new EstadoDto();
		dto.setId(estado.getId());
		dto.setNome(estado.getNome());
		return dto;
	}
}
