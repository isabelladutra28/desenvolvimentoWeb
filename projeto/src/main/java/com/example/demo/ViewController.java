package com.example.demo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Controller
public class ViewController {
	
  @Autowired
  private OcorrenciaService service;

	   @RequestMapping(value ="/home", method = RequestMethod.GET)
	    public String index() {
	        return "home";
	    }
	
	   @RequestMapping(value ="/", method = RequestMethod.GET)
	    public String login() {
	        return "login";
	    }
	   
	   @RequestMapping(method = RequestMethod.GET, value ="/ocorrenciaCadastro")
	   public String entrarTelaCadastro() {
	 	  return "ocorrenciaCadastro";
	   }
	   
	   @RequestMapping(method = RequestMethod.GET, value ="/listaocorrencias")
	   public String listaocorrencias() {
	 	  return "listaocorrencias";
	   }
	   
	   @RequestMapping(method = RequestMethod.GET, value ="/sucess")
	   public String sucess() {
	 	  return "sucess";
	   }
	   

	   @RequestMapping(method = RequestMethod.GET, value ="/listar")
	   public ResponseEntity<Object> listar() {
	 	List<Ocorrencia> response = service.listar();
	 	return ResponseEntity.ok().body(response);	
	   }
	   	   
		
	   
	  @RequestMapping(value ="/excluir", method = RequestMethod.DELETE)
		public void excluir(Ocorrencia ocorrencia) {
			service.excluir(ocorrencia);		
		}
	  
	
	  

	  
	  
	   
	   
}
