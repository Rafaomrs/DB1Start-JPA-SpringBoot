package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.CidadeDto;
import com.example.demo.adapter.CidadeAdapter;
import com.example.demo.domain.entity.Cidade;
import com.example.demo.service.CidadeService;

@RestController
public class CidadeController {
	
	@Autowired
	private CidadeService cidadeService;
	
	@GetMapping("/Cidades")
	public List<CidadeDto> buscarTodasCidadesPorId(){
		List<Cidade> cidade = cidadeService.buscarTodasCidades();
		List<CidadeDto> listaDeRetorno = new ArrayList<>();
		
		cidade.forEach(cidade -> {
			CidadeDto minhaCidadeDto = CidadeAdapter.transformarEntidadeParaDto(cidade);
			listaDeRetorno.add(minhaCidadeDto);
		});
		
		return listaDeRetorno;
	}

}
