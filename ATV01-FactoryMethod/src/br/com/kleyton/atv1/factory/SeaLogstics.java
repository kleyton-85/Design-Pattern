package br.com.kleyton.atv1.factory;

public class SeaLogstics extends Logistics {

	public Transport createTransport() {
		return new Ship();
	}
}
