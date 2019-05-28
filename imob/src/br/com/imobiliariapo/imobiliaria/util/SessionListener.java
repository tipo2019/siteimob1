package br.com.imobiliariapo.imobiliaria.util;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class SessionListener implements HttpSessionListener{
	 private static int activeSessions;

	    @Override
	    public void sessionCreated(HttpSessionEvent event) {
	        activeSessions++;
	        HttpSession session =  event.getSession();
	        
	        System.out.println("sessão criada id: "+session.getId()+" - total de sessões ativas: " + activeSessions);
	    }

	    @Override
	    public void sessionDestroyed(HttpSessionEvent event) {
	        activeSessions--;
	        System.out.println("sessão destruida - total de sessões ativas: " + activeSessions);
	    }
}
