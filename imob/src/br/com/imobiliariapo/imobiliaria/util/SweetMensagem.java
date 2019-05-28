package br.com.imobiliariapo.imobiliaria.util;

import org.primefaces.PrimeFaces;

public class SweetMensagem {
	
	
	

	
	public static void mensagemSweetSucesso(String titulo, String mensagem) {
		
		
		PrimeFaces.current().executeScript("swal(\r\n" + 
				"  '"+titulo+"',\r\n" + 
				"  '"+mensagem+"!',\r\n" + 
				"  'success'\r\n" + 
				")");
		
	}
	
	
	

	public static void mensagemSweetInformacao(String titulo, String mensagem) {
		
		
		PrimeFaces.current().executeScript("swal(\r\n" + 
				"  '"+titulo+"',\r\n" + 
				"  '"+mensagem+"!',\r\n" + 
				"  'info'\r\n" + 
				")");
		
	}
	
	
	

	public static void mensagemSweetAtencao(String titulo, String mensagem) {
		
		
		PrimeFaces.current().executeScript("swal(\r\n" + 
				"  '"+titulo+"',\r\n" + 
				"  '"+mensagem+"!',\r\n" + 
				"  'warning'\r\n" + 
				")");
		
	}
	
	


	

	public static void mensagemSweetErro(String titulo, String mensagem) {
		
		
		PrimeFaces.current().executeScript("swal(\r\n" + 
				"  '"+titulo+"',\r\n" + 
				"  '"+mensagem+"!',\r\n" + 
				"  'error'\r\n" + 
				")");
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
