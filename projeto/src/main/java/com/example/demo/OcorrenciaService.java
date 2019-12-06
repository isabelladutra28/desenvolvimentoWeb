package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.OcorrenciaDAO;

@Service
public class OcorrenciaService {

	@Autowired
	private OcorrenciaDAO dao;
	
	
   public List<Ocorrencia> listar(){	
	   return  dao.findAll();
   }
   
   
   public void salvar(Ocorrencia ocorrencia) {
	   dao.save(ocorrencia);
	   
   }
   
   
   public void excluir(Ocorrencia ocorrencia) {
	   dao.delete(ocorrencia);
   }

   
	public Optional<Ocorrencia> buscar(Integer id){
		return dao.findById(id);
	}
	
}
