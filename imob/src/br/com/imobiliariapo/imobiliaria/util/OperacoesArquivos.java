package br.com.imobiliariapo.imobiliaria.util;
import java.io.File;     
import java.io.FileInputStream;     
import java.io.IOException;     
import java.io.OutputStream;     
import javax.faces.context.ExternalContext;     
import javax.faces.context.FacesContext;     
import javax.servlet.http.HttpServletResponse;     
     
public class OperacoesArquivos {     
     
    public static synchronized boolean downloadFile(String caminho,  
                                                 FacesContext facesContext) {  
    	boolean retorno=false;
     
        ExternalContext context = facesContext.getExternalContext(); // Context     
         
        String fullFileName = caminho.trim();     
        File file = new File(fullFileName); // LINHA ALTERADA     
     System.out.println("Procurando o arquivo "+caminho);
        System.out.println("Tamanho do Aquivo"+file.length());
       
        if(file.length()>0){
        	 HttpServletResponse response = (HttpServletResponse) context.getResponse();     
             response.setHeader("Content-Disposition", "attachment; filename=" + file.getName() ); //aki eu seto o header e o nome q vai aparecer na hr do donwload     
             
				        response.setContentLength((int) file.length()); // O tamanho do arquivo     
				        response.setContentType("application/pdf"); // e obviamente o tipo     
				     retorno = true;
				        try {     
				            FileInputStream in = new FileInputStream(file);     
				            OutputStream out = response.getOutputStream();     
				             
				            byte[] buf = new byte[(int)file.length()];     
				            int count;     
				            while ((count = in.read(buf)) >= 0) {     
				                out.write(buf, 0, count);     
				            }
				            
				            facesContext.responseComplete();   
			    	         out.flush(); 
				            in.close();     
				            out.flush();     
				            out.close();     
				        facesContext.responseComplete();     
				        } catch (IOException ex) {     
				            System.out.println("Error in downloadFile: " + ex.getMessage());     
				            ex.printStackTrace();     
				        }
				        
        }else{
        	
        	retorno=  false;
        	System.out.println(retorno);
        	System.out.println("Contrato não disponivel para download mensagem de teste");
        }
        return retorno;
    }     
}  