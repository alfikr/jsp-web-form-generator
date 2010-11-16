package br.inf.carlos.webformgenerator.teste.run;

import java.io.IOException;

import br.inf.carlos.webformgenerator.WebFormApplication;


public class Teste {
	
	public static void main(String[] args) {
		WebFormApplication app = new WebFormApplication(
			"br.inf.carlos.webformgenerator.teste.beans",
			"WebContent/",
			"jspx"
		);
		
		try {
			app.buildWebForms();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
