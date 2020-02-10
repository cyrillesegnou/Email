package fr.gtm.email;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TemplateHtmlTest {

	public static void main(String[] args) throws IOException {
		

		List<String> lignes= Files.readAllLines(Paths.get("template.html"));
		StringBuilder sb = new StringBuilder(); 
		for(String l : lignes) {
			sb.append(l);
			
		}
		String html = sb.toString();
		System.out.println(html);
	}
	

}
