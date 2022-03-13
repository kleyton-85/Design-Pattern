package br.com.kleyton.designpattern;

public class VictorianFurnitureFactory implements FurnitureFactory {

	public Chair createChair() {
		return new VictorianChair();

	}

	public CoffeTable createCoffeTable() {
		return new VictorianCoffeTable();

	}

	public Sofa createSofa() {
		return new VictorianSofa();

	}

}