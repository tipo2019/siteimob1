package br.com.imobiliariapo.imobiliaria.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Log implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Date data;
	@ManyToOne
	@JoinColumn(name="usuario", nullable=true)
	private Usuario usuario;
	private String descricao;
	private String IP;
	//@ManyToOne
	//@JoinColumn(name="tipo")
	//private TipoLog tipo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	

	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	
	
	@Override
	public String toString() {
		return String.valueOf(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Log other = (Log) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	
	
}
