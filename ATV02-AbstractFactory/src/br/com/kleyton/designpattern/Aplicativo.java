package br.com.kleyton.designpattern;


public class Aplicativo {
	
	private Chair chair;
	private CoffeTable coffetable;
	private Sofa sofa;
	
	public Aplicativo(FurnitureFactory factory) {
		chair = factory.createChair();
		coffetable = factory.createCoffeTable();
		sofa = factory.createSofa();
	}
	
	public void hasLegs() {
		chair.hasLegs();
		coffetable.hasLegs();
		sofa.hasLegs();
	}
	
	public void sitOn() {
		chair.sitOn();
		coffetable.sitOn();
		sofa.sitOn();
	}
	
	public Aplicativo configuracao(String tipo) {
		Aplicativo app;
		FurnitureFactory factory;
		
		if(tipo.equalsIgnoreCase("1")) {
			factory = new ArtDecoFurnitureFactory();
			app = new Aplicativo(factory);
		}
		
		else if (tipo.equalsIgnoreCase("2")) {
			factory = new VictorianFurnitureFactory();
			app = new Aplicativo(factory);
		}
		
		else if(tipo.equalsIgnoreCase("3")) {
			factory = new ModernFurnitureFactory();
			app = new Aplicativo(factory);
		}
		// Tratamento de Erros, caso nao seja String dará um error
		
		else return null;
		return app;
	}
	
}
