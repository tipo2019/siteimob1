package br.com.imobiliariapo.imobiliaria.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contrato implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int    id;
	private int pessoa;
	private int tp_contrato; //0-contrato novo  1-renovação
	private double vl_aluguel;
	private float taxa;
	private float indice_reaj;
	private String forma_reaj; // de quanto em quanto tempo (ex.; 12 meses)
	private String ativ_comercial; // se for comercial será para qual Atividade
	private int prazo;
	private Date dt_inicio;
	private Date dt_termino;
	private String obs;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getPessoa() {
		return pessoa;
	}
	public void setPessoa(int pessoa) {
		this.pessoa = pessoa;
	}
	public int getTp_contrato() {
		return tp_contrato;
	}
	public void setTp_contrato(int tp_contrato) {
		this.tp_contrato = tp_contrato;
	}
	public double getVl_aluguel() {
		return vl_aluguel;
	}
	public void setVl_aluguel(double vl_aluguel) {
		this.vl_aluguel = vl_aluguel;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	public float getIndice_reaj() {
		return indice_reaj;
	}
	public void setIndice_reaj(float indice_reaj) {
		this.indice_reaj = indice_reaj;
	}
	public String getForma_reaj() {
		return forma_reaj;
	}
	public void setForma_reaj(String forma_reaj) {
		this.forma_reaj = forma_reaj;
	}
	public String getAtiv_comercial() {
		return ativ_comercial;
	}
	public void setAtiv_comercial(String ativ_comercial) {
		this.ativ_comercial = ativ_comercial;
	}
	public int getPrazo() {
		return prazo;
	}
	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
	public Date getDt_inicio() {
		return dt_inicio;
	}
	public void setDt_inicio(Date dt_inicio) {
		this.dt_inicio = dt_inicio;
	}
	public Date getDt_termino() {
		return dt_termino;
	}
	public void setDt_termino(Date dt_termino) {
		this.dt_termino = dt_termino;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return String.valueOf(id);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contrato other = (Contrato) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	
	
	
	
}
