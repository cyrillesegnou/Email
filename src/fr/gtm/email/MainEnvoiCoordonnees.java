package fr.gtm.email;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class MainEnvoiCoordonnees {

	public static void main(String[] args) throws EmailException, IOException {
		
		
		  HtmlEmail email = new HtmlEmail();
		  email.setHostName("192.168.1.69");
			email.setSmtpPort(25);
		  email.addTo("georgina@bovoyages");
		  email.setFrom("Rolland@bovoyages.net");
		  email.setSubject("confirmation de votre commande");
		  email.setCharset("UTF-8");
		  
		List<String> lignes= Files.readAllLines(Paths.get("template.html"));
			StringBuilder sb = new StringBuilder(); 
			for(String l : lignes) {
				sb.append(l);
				
			}
			String html = sb.toString();
			
			
			String str1 = "M" ;
			String str2 = "alain";
			String str3 = "renard";
			
			String html1 = html.replace("{{civilite}}", str1);
			String html2 = html1.replace("{{prenom}}", str2);
			String html3 = html2.replace("{{nom}}", str3);
						
		
			
			email.setMsg(html3);
			email.send();
			System.out.println("Email Envoyer");
			System.out.println(html3);
			}

}
