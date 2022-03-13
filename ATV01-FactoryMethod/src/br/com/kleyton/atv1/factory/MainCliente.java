package br.com.kleyton.atv1.factory;

import java.io.*;

public class MainCliente {

	public static void main(String[] args) throws IOException {
		Fabrica fabrica = new Fabrica();
		
		System.out.println("\n ##### OPÇÕES DE TRANSPORTE ##### "
				+ "\n\n      1 - Terrestre"
				+ "\n      2 - Maritimo"
				+ "\n\n --> Escolha a Forma de Envio:");
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		String tipoEnvio = buff.readLine();
		
		Transport userPlan = fabrica.t(tipoEnvio);
	
		userPlan.deliver();
		
	}

}
