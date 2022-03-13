package br.com.kleyton.designpattern;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

	public Chair createChair() {
		return new ArtDecoChair();

	}

	public CoffeTable createCoffeTable() {
		return new ArtDecoCoffeTable();

	}

	public Sofa createSofa() {
		return new ArtDecoSofa();

	}

}
