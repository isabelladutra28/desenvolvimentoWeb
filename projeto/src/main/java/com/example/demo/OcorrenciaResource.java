package com.example.demo;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(value = "/ocorrencia")
public class OcorrenciaResource {

	@Autowired
	private OcorrenciaService service;
	
	  @RequestMapping(value ="/salvar", method = RequestMethod.POST)
		public ResponseEntity<Void> salvar(@RequestBody Ocorrencia ocorrencia) {
			service.salvar(ocorrencia);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(ocorrencia.getId()).toUri();
			return ResponseEntity.created(uri).build();
		}
}
