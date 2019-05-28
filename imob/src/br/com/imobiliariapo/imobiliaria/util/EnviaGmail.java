package br.com.imobiliariapo.imobiliaria.util;

import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EnviaGmail {
	
	static Properties mailServerProperties;
	static Session getMailSession;
	static MimeMessage generateMailMessage;
 
	/*envio de email*/
	
	public void enviaEmail(List<String> destinatarios, List<String> copiados, String assunto, String mensagem) throws AddressException, MessagingException {
		 
		// Step1
		System.out.println("\n 1st ===> setup Mail Server Properties..");
		mailServerProperties = System.getProperties();
		mailServerProperties.put("mail.smtp.port", "587");
		mailServerProperties.put("mail.smtp.auth", "true");
		mailServerProperties.put("mail.smtp.starttls.enable", "true");
		mailServerProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		System.out.println("Mail Server Properties have been setup successfully..");
 
		// Step2
		System.out.println("\n\n 2nd ===> get Mail Session..");
		getMailSession = Session.getDefaultInstance(mailServerProperties, null);
		generateMailMessage = new MimeMessage(getMailSession);
		
		if(destinatarios!=null&&!destinatarios.isEmpty()){
			
			for(String str:destinatarios){
			
			if(valida(str)){
				
				generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(str));
			}
			}
		}
		
		
		
		if(copiados!=null&&!copiados.isEmpty()){
			
			for(String strc:copiados){
			
			if(valida(strc)){
				
				generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress(strc));
			}
			}
		}
		
	
	
		generateMailMessage.setSubject(assunto);
		String emailBody = mensagem;
		generateMailMessage.setContent(emailBody, "text/html");
		System.out.println("Mail Session has been created successfully..");
 
		// Step3
		System.out.println("\n\n 3rd ===> Get Session and Send mail");
		Transport transport = getMailSession.getTransport("smtp");
 
		// Enter your correct gmail UserID and Password
		// if you have 2FA enabled then provide App Specific Password
		transport.connect("smtp.gmail.com", "edsonfire@gmail.com", "BEAtriz1");
		transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
		transport.close();
	}
	
	
	
    public void enviarEmailHtml(String remetente, String destinatario, String assunto, String conteudoHtml) throws Exception {
        try {
 
        	
       	 
    		// Step1
    		System.out.println("\n 1st ===> setup Mail Server Properties..");
    		mailServerProperties = System.getProperties();
    		mailServerProperties.put("mail.smtp.port", "587");
    		mailServerProperties.put("mail.smtp.auth", "true");
    		mailServerProperties.put("mail.smtp.starttls.enable", "true");
    		mailServerProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    		System.out.println("Mail Server Properties have been setup successfully..");
     
    		// Step2
    		System.out.println("\n\n 2nd ===> get Mail Session..");
    		getMailSession = Session.getDefaultInstance(mailServerProperties, null);
    		generateMailMessage = new MimeMessage(getMailSession);
        	
    		
    		generateMailMessage.setFrom(new InternetAddress(remetente));
 
            Address[] toUser = InternetAddress.parse(destinatario);
 
            generateMailMessage.setRecipients(Message.RecipientType.TO, toUser);
            generateMailMessage.setSubject(assunto);
 
            Multipart multipart = new MimeMultipart("related");
            BodyPart htmlPart = new MimeBodyPart();
            htmlPart.setContent(conteudoHtml, "text/html");
 
            multipart.addBodyPart(htmlPart);
 
            generateMailMessage.setContent(multipart);
 
            /**
             * Método para enviar a mensagem criada
             */
            Transport.send(generateMailMessage);
 
            System.out.println("Email enviado com Sucesso; ");
 
        } catch (MessagingException e) {
            throw new Exception("Erro ao enviar email! \n" + e.getMessage());
        }
 
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private boolean valida(String email){
		
		

	    boolean isEmailIdValid = false;
	   
	    if (email != null && email.length() > 0) {
	        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(email);
	        if (matcher.matches()) {
	            isEmailIdValid = true;
	        }
	    }
		
		return isEmailIdValid;
	}
	
	
	

}
