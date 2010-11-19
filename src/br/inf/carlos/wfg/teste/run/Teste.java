package br.inf.carlos.wfg.teste.run;

import java.io.IOException;

import br.inf.carlos.wfg.WebFormApplication;


public class Teste {
	
	public static void main(String[] args)
	{
		WebFormApplication app = new WebFormApplication(
			"br.inf.carlos.wfg.teste.beans",
			"WebContent/jsp/",
			"jsp"
		);
		
		try {
			app.buildWebForms();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
