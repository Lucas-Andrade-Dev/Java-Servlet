package br.com.curso.servlet.modelo;

import java.util.Date;


public class Empresa {
	
	private Integer id;
	private String nome;
	private Date data;
	private  static Integer num=0;
	
	public Empresa() {
		
	}
	
	public Empresa(String nome, Date data) {
		num = num+1;
		this.id = num;
		this.nome = nome;
		this.data = data;
		
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getId() {
		return id;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	

}
