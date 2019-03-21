package entities;

public class Exchange {

	public double dolar;
	public double quant;
	
	public double reais() {
		return (dolar * quant);
	}
	public double iof() {
		return reais() * 0.06;
	}
	public double total() {
		return iof() + reais();
	}
}
