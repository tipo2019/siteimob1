package br.com.imobiliariapo.imobiliaria.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RetiraAcento {
	
	public static String trocaAcentuacao(String acentuada) {   
	    if (acentuada.isEmpty()) {   
	        return acentuada;   
	    }   
	    char[] acentuados = new char[]    {'å','ç', 'á', 'à', 'ã', 'â', 'ä', 'é', 'è', 'ê', 'ë', 'í', 'ì', 'î', 'ï', 'ó', 'ò', 'õ', 'ô', 'ö', 'ú', 'ù', 'û', 'ü','µ','Ö','µ','§','&','º','ª','°','²','³','$',' ','¡','¨','¬','‡','‚','š','ž','”','›','ƒ'};   
	  
	    char[] naoAcentuados = new char[] {'a','c', 'a', 'a', 'a', 'a', 'a', 'e', 'e', 'e', 'e', 'i', 'i', 'i', 'i', 'o', 'o', 'o', 'o', 'o', 'u', 'u', 'u', 'u','a','I','A','o','e','o','a','o','2','3','S','-','i','e','i','a','a','e','i','o','u','v'};   
	  
	    for (int i = 0; i < acentuados.length; i++) {   
	        acentuada = acentuada.replace(acentuados[i], naoAcentuados[i] );   
	        acentuada = acentuada.replace(Character.toUpperCase(acentuados[i] ), Character.toUpperCase(naoAcentuados[i] ) );   
	    }   
	    return acentuada;   
	}  


	public static String retiraMascara(String acentuada) {   
	    if (acentuada.isEmpty()) {   
	        return acentuada;   
	    }   
	      acentuada = acentuada.replace(".","");   
		  acentuada = acentuada.replace("-", "");
		  acentuada = acentuada.replace("/", "");
		  acentuada = acentuada.replace("\\", "");
	   return acentuada;   
	}  
	
	public static java.io.File getFile(java.io.File file) throws IOException{
		//System.out.println("Recebendo o arquivo "+file.getAbsolutePath());
		  String texto = gettexto(file.getAbsolutePath());
	        String texto2 = trocaAcentuacao(texto);
	     //  System.out.println("Texto Recebido "+texto);
	      //  System.out.println("Texto Alterado "+texto2);
		FileWriter fw = new FileWriter(file.getAbsolutePath());
	        PrintWriter pw = new PrintWriter(fw,true);
	      
	      //  System.out.println("Texto Processado"+texto2);
	      pw.print(texto2);
	        pw.close();
	        fw.close();
		
		
		return file;
	}
	
	
	private static String gettexto(String arquivo) throws IOException{
		 
		  String aux = "";   
		  String str = "";   
		  File f = new File(arquivo);   
		  if(f.exists()){   
			 // System.out.println("Exite");
		    FileReader reader = new FileReader(f);   
		    BufferedReader leitor = new BufferedReader(reader);   
		    while(str != null){ // sai quando o leitor da linha for nula   
		      aux += str; //aux = linhas lidas   
		      str = leitor.readLine(); // lê as linhas do arquivo, linha a linha   
		    }   
		  leitor.close();   
		  reader.close();   

	//	  System.out.println("Texto Recebido "+aux);
		
	}
	
			return aux;
	
}



}
