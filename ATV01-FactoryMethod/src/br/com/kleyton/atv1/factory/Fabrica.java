package br.com.kleyton.atv1.factory;


public class Fabrica {

	public Transport t (String tipoEnvio) {
		
		if(tipoEnvio.equalsIgnoreCase("1")) {
			return new Truck();
		}
		
		else if (tipoEnvio.equalsIgnoreCase("2")) {
			return new Ship();
		}
		
		// Tratamento de Erros, caso nao seja String dará um error
		else return null;
	}
}
