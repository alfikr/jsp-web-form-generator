package br.inf.carlos.wfg.teste.run;

import java.io.IOException;

import br.inf.carlos.wfg.util.ContextValidator;

public class TesteWebContext {
	public static void main(String[] args) {
		
		try {
			ContextValidator.isValidWebProjectContext();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
