package br.inf.carlos.teste;

import java.io.File;

import br.inf.carlos.teste.beans.Cliente;

public class TesteFile {
	public static void main(String[] args) {
		
		File file = new File("./src/br/inf/carlos/teste/beans/controller/");
		
		file.mkdirs();
		
		String[] files = file.list();
		
		for (String string : files) {
			System.out.println(string);
		}
	}
}
