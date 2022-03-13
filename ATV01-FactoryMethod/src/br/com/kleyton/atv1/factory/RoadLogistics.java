package br.com.kleyton.atv1.factory;

public class RoadLogistics extends Logistics {
	
	public Transport createTransport() {
		return new Truck();
	}
}
