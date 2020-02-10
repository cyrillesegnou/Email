package fr.gtm.email;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;



public class SimpleEmailTest {

	public static void main(String[] args) throws EmailException, MalformedURLException {
		
		 // Create the email message
		
		Email email = new SimpleEmail();
		email.setHostName("192.168.1.69");
		email.setSmtpPort(25);
		email.setFrom("toto@foo.net");
		email.addTo("cyrille@bovoyages");
		email.setSubject("Test") ;
		email.setMsg("envoie de message");
		email.send();
		System.out.println("Email Envoyer");
	}
	
}