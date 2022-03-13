package br.com.kleyton.designpattern;

public class VictorianSofa implements Sofa {

	@Override
	public void hasLegs() {
		System.out.println("\n  --> O Sofa Victoriano tem 4 pernas!");

	}

	@Override
	public void sitOn() {
		System.out.println("\n  --> Sente-se no Sofa Victoriano!");

	}

}
