
public  class Conta{

	private Titular titular;
	private double numero;
	private double saldo;
	

	public Titular getTitular() {
		return titular;
	}
	
	public Titular setTitular(Titular titular) {
		return this.titular = titular;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	public double deposita(double valor){
		return this.saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}
