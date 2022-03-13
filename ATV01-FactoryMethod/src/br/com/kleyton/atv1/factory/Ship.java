package br.com.kleyton.atv1.factory;

public class Ship implements Transport {

	public void deliver() {
		System.out.println("\n ###### ENTREGA MARITIMA (BARCO) ######"
				+ "\n --> Entrega por Mar em um Contêiner!");
	}
}
