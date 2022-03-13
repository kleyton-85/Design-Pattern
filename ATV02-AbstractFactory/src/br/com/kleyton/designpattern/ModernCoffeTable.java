package br.com.kleyton.designpattern;

public class ModernCoffeTable implements CoffeTable {

	@Override
	public void hasLegs() {
		System.out.println("\n  --> A Mesa de Centro Moderno tem 4 pernas!");

	}

	@Override
	public void sitOn() {
		System.out.println("\n  --> Sente-se na Mesa de Centro Moderno!");

	}

}
