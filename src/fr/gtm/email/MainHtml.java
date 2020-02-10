package fr.gtm.email;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class MainHtml {

	public static void main(String[] args) throws EmailException, MalformedURLException {
		
		
		 // Create the email message
		  HtmlEmail email = new HtmlEmail();
		  email.setHostName("192.168.1.69");
			email.setSmtpPort(25);
		  email.addTo("cyrille@bovoyages");
		  email.setFrom("toto@foo.net");
		  email.setSubject("Test email with inline image");
		  
		  // embed the image and get the content id
		  URL url = new URL("http://www.apache.org/images/asf_logo_wide.gif");
		  String cid = email.embed(url, "Apache logo");
		  
		  // set the html message
		  email.setHtmlMsg("<html>\n" +
		  		"	<head>\n" + 
		  		"	<meta charset= \"UTF-8\">               \n" + 
		  		"        </head>\n" + 
		  		"	\n" + 
		  		"	<body>\n" + 
		  		"                <h2> Merci </h2>\n" + 
		  		"	</body>\n" + 
		  		"</html>");

		  // set the alternative message
		//  email.setTextMsg("Your email client does not support HTML messages");

		  // send the email
		  email.send();
			System.out.println("Email Envoyer");
		

	}

}
