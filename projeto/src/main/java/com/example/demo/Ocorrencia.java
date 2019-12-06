/**
 * 
 */
package com.example.demo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ocorrencia implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String descricao;
	private Date dataDeCriacao;
	private String status;

	
	
	public Ocorrencia() {
		
	}
	
public Ocorrencia(Integer id, String titulo) {
		this.id=id;
		this.titulo=titulo;
	}
	
	
	public Ocorrencia(Integer id, String titulo, String descricao,
			Date dataDeCriacao, String status) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataDeCriacao = dataDeCriacao;
		this.status = status;

	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Date getDataDeCriacao() {
		return dataDeCriacao;
	}
	public void setDataDeCriacao(Date dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	
	
	
	
	
	

}
