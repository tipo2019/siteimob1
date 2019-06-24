package br.com.imobiliariapo.imobiliaria.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int tp_pessoa; // 0-Proprietário 1-Locatário 2-Fiador 3-Referencia
							// 4-Socio
	private String nome;
	private int estado_civil; // 0-Solteiro 1-Casado 2-Separado 3-Divorciado
								// 4-Viuvo
	private String regime_est_civil;
	private String rg;
	private String org_exp_rg;
	private Date dt_exp_rg;
	private String cpf_cnpj;
	private String nacionalidade;
	private String profissao;
	private Date dt_nasc;
	private String naturalidade;
	private String uf_natural;
	private String sexo; // F,M ou N (N quando for empresa)
	private String email;
	private String empresa;
	private String filiacao1; // pai
	private String filiacao2; // mãe
	private String end_prof;
	private String bairro_prof;
	private String cidade_prof;
	private String uf_prof;
	private String cep_prof;
	private String fone_prof;
	private String end_res;
	private String bairro_res;
	private String cidade_res;
	private String uf_res;
	private String cep_res;
	private String fone_res;
	private String conjuge;
	private String rg_conj;
	private String org_exp_rg_conj;
	private String dt_exp_rg_conj;
	private String cpf_cnpj_conj;
	private String nacionalidade_conj;
	private String profissao_conj;
	private Date dt_nasc_conj;
	private String naturalidade_conj;
	private String uf_natural_conj;
	private String sexo_conj; // F, M ou N (N quando for empresa)
	private String email_conj;
	private String empresa_conj;
	private String end_prof_conj;
	private String bairro_prof_conj;
	private String cidade_prof_conj;
	private String uf_prof_conj;
	private String cep_prof_conj;
	private String fone_prof_conj;

	public int getTp_pessoa() {
		return tp_pessoa;
	}

	public void setTp_pessoa(int tp_pessoa) {
		this.tp_pessoa = tp_pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(int estado_civil) {
		this.estado_civil = estado_civil;
	}

	public String getRegime_est_civil() {
		return regime_est_civil;
	}

	public void setRegime_est_civil(String regime_est_civil) {
		this.regime_est_civil = regime_est_civil;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getOrg_exp_rg() {
		return org_exp_rg;
	}

	public void setOrg_exp_rg(String org_exp_rg) {
		this.org_exp_rg = org_exp_rg;
	}

	public Date getDt_exp_rg() {
		return dt_exp_rg;
	}

	public void setDt_exp_rg(Date dt_exp_rg) {
		this.dt_exp_rg = dt_exp_rg;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Date getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(Date dt_nasc) {
		this.dt_nasc = dt_nasc;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getUf_natural() {
		return uf_natural;
	}

	public void setUf_natural(String uf_natural) {
		this.uf_natural = uf_natural;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFiliacao1() {
		return filiacao1;
	}

	public void setFiliacao1(String filiacao1) {
		this.filiacao1 = filiacao1;
	}

	public String getFiliacao2() {
		return filiacao2;
	}

	public void setFiliacao2(String filiacao2) {
		this.filiacao2 = filiacao2;
	}

	public String getSexo_conj() {
		return sexo_conj;
	}

	public void setSexo_conj(String sexo_conj) {
		this.sexo_conj = sexo_conj;
	}

	public String getEnd_prof() {
		return end_prof;
	}

	public void setEnd_prof(String end_prof) {
		this.end_prof = end_prof;
	}

	public String getBairro_prof() {
		return bairro_prof;
	}

	public void setBairro_prof(String bairro_prof) {
		this.bairro_prof = bairro_prof;
	}

	public String getCidade_prof() {
		return cidade_prof;
	}

	public void setCidade_prof(String cidade_prof) {
		this.cidade_prof = cidade_prof;
	}

	public String getUf_prof() {
		return uf_prof;
	}

	public void setUf_prof(String uf_prof) {
		this.uf_prof = uf_prof;
	}

	public String getCep_prof() {
		return cep_prof;
	}

	public void setCep_prof(String cep_prof) {
		this.cep_prof = cep_prof;
	}

	public String getFone_prof() {
		return fone_prof;
	}

	public void setFone_prof(String fone_prof) {
		this.fone_prof = fone_prof;
	}

	public String getEnd_res() {
		return end_res;
	}

	public void setEnd_res(String end_res) {
		this.end_res = end_res;
	}

	public String getBairro_res() {
		return bairro_res;
	}

	public void setBairro_res(String bairro_res) {
		this.bairro_res = bairro_res;
	}

	public String getCidade_res() {
		return cidade_res;
	}

	public void setCidade_res(String cidade_res) {
		this.cidade_res = cidade_res;
	}

	public String getUf_res() {
		return uf_res;
	}

	public void setUf_res(String uf_res) {
		this.uf_res = uf_res;
	}

	public String getCep_res() {
		return cep_res;
	}

	public void setCep_res(String cep_res) {
		this.cep_res = cep_res;
	}

	public String getFone_res() {
		return fone_res;
	}

	public void setFone_res(String fone_res) {
		this.fone_res = fone_res;
	}

	public String getConjuge() {
		return conjuge;
	}

	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}

	public String getRg_conj() {
		return rg_conj;
	}

	public void setRg_conj(String rg_conj) {
		this.rg_conj = rg_conj;
	}

	public String getOrg_exp_rg_conj() {
		return org_exp_rg_conj;
	}

	public void setOrg_exp_rg_conj(String org_exp_rg_conj) {
		this.org_exp_rg_conj = org_exp_rg_conj;
	}
/*teste*/
	public String getDt_exp_rg_conj() {
		return dt_exp_rg_conj;
	}

	public void setDt_exp_rg_conj(String dt_exp_rg_conj) {
		this.dt_exp_rg_conj = dt_exp_rg_conj;
	}

	public String getCpf_cnpj_conj() {
		return cpf_cnpj_conj;
	}

	public void setCpf_cnpj_conj(String cpf_cnpj_conj) {
		this.cpf_cnpj_conj = cpf_cnpj_conj;
	}

	public String getNacionalidade_conj() {
		return nacionalidade_conj;
	}

	public void setNacionalidade_conj(String nacionalidade_conj) {
		this.nacionalidade_conj = nacionalidade_conj;
	}

	public String getProfissao_conj() {
		return profissao_conj;
	}

	public void setProfissao_conj(String profissao_conj) {
		this.profissao_conj = profissao_conj;
	}

	public Date getDt_nasc_conj() {
		return dt_nasc_conj;
	}

	public void setDt_nasc_conj(Date dt_nasc_conj) {
		this.dt_nasc_conj = dt_nasc_conj;
	}

	public String getNaturalidade_conj() {
		return naturalidade_conj;
	}

	public void setNaturalidade_conj(String naturalidade_conj) {
		this.naturalidade_conj = naturalidade_conj;
	}

	public String getUf_natural_conj() {
		return uf_natural_conj;
	}

	public void setUf_natural_conj(String uf_natural_conj) {
		this.uf_natural_conj = uf_natural_conj;
	}

	public String getEmail_conj() {
		return email_conj;
	}

	public void setEmail_conj(String email_conj) {
		this.email_conj = email_conj;
	}

	public String getEmpresa_conj() {
		return empresa_conj;
	}

	public void setEmpresa_conj(String empresa_conj) {
		this.empresa_conj = empresa_conj;
	}

	public String getEnd_prof_conj() {
		return end_prof_conj;
	}

	public void setEnd_prof_conj(String end_prof_conj) {
		this.end_prof_conj = end_prof_conj;
	}

	public String getBairro_prof_conj() {
		return bairro_prof_conj;
	}

	public void setBairro_prof_conj(String bairro_prof_conj) {
		this.bairro_prof_conj = bairro_prof_conj;
	}

	public String getCidade_prof_conj() {
		return cidade_prof_conj;
	}

	public void setCidade_prof_conj(String cidade_prof_conj) {
		this.cidade_prof_conj = cidade_prof_conj;
	}

	public String getUf_prof_conj() {
		return uf_prof_conj;
	}

	public void setUf_prof_conj(String uf_prof_conj) {
		this.uf_prof_conj = uf_prof_conj;
	}

	public String getCep_prof_conj() {
		return cep_prof_conj;
	}

	public void setCep_prof_conj(String cep_prof_conj) {
		this.cep_prof_conj = cep_prof_conj;
	}

	public String getFone_prof_conj() {
		return fone_prof_conj;
	}

	public void setFone_prof_conj(String fone_prof_conj) {
		this.fone_prof_conj = fone_prof_conj;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
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
		Pessoa other = (Pessoa) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
