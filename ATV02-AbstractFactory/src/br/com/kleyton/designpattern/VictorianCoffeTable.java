package br.com.kleyton.designpattern;

public class VictorianCoffeTable implements CoffeTable {

	@Override
	public void hasLegs() {
		System.out.println("\n  --> A Mesa de Centro Victoriano tem 4 pernas!");

	}

	@Override
	public void sitOn() {
		System.out.println("\n  --> Sente-se na Mesa de Centro Victoriano!");

	}

}
