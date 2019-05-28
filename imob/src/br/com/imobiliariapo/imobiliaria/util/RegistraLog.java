package br.com.imobiliariapo.imobiliaria.util;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import br.com.imobiliariapo.imobiliaria.modelo.Usuario;

public class RegistraLog implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Usuario usuarioLogado = new Usuario();
	
	
	
	public RegistraLog()
	{
			//usuarioLogado = new VerificaPermissao().getUsuarioLogado();
	}
	
	
	
	
	
	/*
	
	public void gravaLog(String op, TipoLog tipo) {
		Log l = new Log();
		l.setData(new Date());
		l.setUsuario(usuarioLogado);
		l.setDescricao(usuarioLogado.getName()+" "+op);
		l.setIP(pegarIp());
		l.setTipo(tipo);

		new LogDAO().save(l);
	}
*/
	public String pegarIp() {

		HttpServletRequest request = (HttpServletRequest) FacesContext
				.getCurrentInstance().getExternalContext().getRequest();
		String ip = request.getRemoteAddr();

		return ip;
	}


}
