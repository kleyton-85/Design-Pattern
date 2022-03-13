package br.com.kleyton.designpattern;

public class ModernFurnitureFactory implements FurnitureFactory {

	public ModernChair createChair() {
		return new ModernChair();

	}

	public CoffeTable createCoffeTable() {
		return new ModernCoffeTable();

	}

	public Sofa createSofa() {
		return new ModernSofa();

	}
}
