package br.com.kleyton.atv1.factory;

public abstract class Logistics {
	
	abstract Transport createTransport();
	
	public void planDelivery() {
		Transport t = createTransport();
	}
	
}
