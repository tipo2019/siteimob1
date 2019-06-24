package br.com.imobiliariapo.imobiliaria.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class EmailValidator implements Validator{


/*
 * 
 * classe para validação de emails
 * ss
 * */


public void validate(FacesContext facesContext, UIComponent uIComponent, Object object) throws ValidatorException 
{
    boolean isEmailIdValid = false;
    String email =(String)object;
    if (email != null && email.length() > 0) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            isEmailIdValid = true;
        }
        ///comentario githubf
    }
    if (!isEmailIdValid) {
        FacesMessage message = new FacesMessage();
        message.setDetail("E-mail Inválido!");
        message.setSummary("E-mail Inválido!");
        message.setSeverity(FacesMessage.SEVERITY_ERROR);
        throw new ValidatorException(message);
    }
    

}



}