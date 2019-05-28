package br.com.imobiliariapo.imobiliaria.util;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import br.com.imobiliariapo.imobiliaria.modelo.Usuario;

public class VerificaPermissao {

	Usuario usuarioLogado = new Usuario();
	   
 
	public VerificaPermissao(){
		HttpSession sessions = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);	
		usuarioLogado = (Usuario) sessions.getAttribute("usuario");
		
	}

	

	public boolean isMaster()

	{
		boolean ret=false;
		if(usuarioLogado!=null && usuarioLogado.getPerfil()==2){
			ret= true;			
		}
		
       return ret;
	}



	public boolean isAdministrador()

	{


		boolean ret=false;
		if(usuarioLogado!=null && usuarioLogado.getPerfil()>=1){
			ret= true;			
		}
		
       return ret;


	}

	public boolean isUsuario()

	{

		boolean ret=false;
		if(usuarioLogado!=null && usuarioLogado.getPerfil()>=0){
			ret= true;			
		}
		
       return ret;
	}



	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}
	
	
	
}
