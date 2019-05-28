package br.com.imobiliariapo.imobiliaria.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.com.imobiliariapo.imobiliaria.modelo.Usuario;
import br.com.imobiliariapo.imobiliaria.util.SessionFac;

public class UsuarioDAO extends DaoGenerico<Usuario, Integer> {
	
	
	
	
	public Usuario login(String u, String s){
		
		
		Session session = new SessionFac().getSession();
		session.beginTransaction();
		Criteria crit = session.createCriteria(Usuario.class)
		.add(Restrictions.eq("username", u))
		.add(Restrictions.eq("password", s))
		.add(Restrictions.eq("ativo",1));
		List<Usuario> OrdemCompras = crit.list();
		session.getTransaction().commit();
		session.close();
		if(OrdemCompras.size()>0){
			return OrdemCompras.get(0);
			
		}else{
			return null;
		}
					
				
}


public Usuario pesquisaUsuario(String u){
	
	
	Session session = new SessionFac().getSession();
	session.beginTransaction();
	Criteria crit = session.createCriteria(Usuario.class)
	.add(Restrictions.eq("userame", u));
	List<Usuario> OrdemCompras = crit.list();
	session.getTransaction().commit();
	session.close();
	if(OrdemCompras.size()>0){
		return OrdemCompras.get(0);
		
	}else{
		return null;
	}
				
			
}


public boolean existe(String u){
	
	
	Session session = new SessionFac().getSession();
	session.beginTransaction();
	Criteria crit = session.createCriteria(Usuario.class)
	.add(Restrictions.eq("username", u));
	List<Usuario> OrdemCompras = crit.list();
	session.getTransaction().commit();
	session.close();
	if(OrdemCompras.size()>0){
		return true;
		
	}else{
		return false;
	}
				
			
}


}
