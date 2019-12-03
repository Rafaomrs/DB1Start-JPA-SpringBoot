package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.EstadoDto;
import com.example.demo.Dto.EstadoFormDto;
import com.example.demo.adapter.EstadoAdapter;
import com.example.demo.domain.entity.Estado;
import com.example.demo.service.EstadoService;

@RestController
public class EstadoController {
	
	@Autowired
	private EstadoService estadoService;
	
	//EndPoint
	@GetMapping("/Estados")      
	public List<EstadoDto> buscarTodosEstados() {
		List<Estado> estados = estadoService.BuscarTodos();
		List<EstadoDto> listaDeRetorno = new ArrayList<>();
		
		estados.forEach(estado -> {
			EstadoDto meuEstadoDto = EstadoAdapter.transformaEntidadeParaDto(estado);
			listaDeRetorno.add(meuEstadoDto);
		});
		
		return listaDeRetorno;
	
	}
	@PostMapping("/Estados")
	public void cadastrarNovoEstado(@RequestBody EstadoFormDto form) {
		estadoService.criar(form.getNome());
	}
}
