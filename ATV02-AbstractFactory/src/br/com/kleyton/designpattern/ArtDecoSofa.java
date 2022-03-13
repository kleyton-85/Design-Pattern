package br.com.kleyton.designpattern;

public class ArtDecoSofa implements Sofa {

	@Override
	public void hasLegs() {
		System.out.println("\n  --> O Sofa Art Deco tem 4 pernas!");

	}

	@Override
	public void sitOn() {
		System.out.println("\n  --> Sente-se no Sofa Art Deco!");

	}

}
