package br.com.kleyton.atv1.factory;

public class Truck implements Transport {

	public void deliver() {
		System.out.println("\n ###### ENTREGA TERRESTRE (CAMINHÃO) ######"
				+ "\n   --> Entrega por Terra em uma Caixa!");
	}
}
