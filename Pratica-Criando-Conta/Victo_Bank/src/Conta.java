
public abstract class Conta implements Titular {

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
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public boolean  deposita(double valor){
		if(valor > 1) {
			this.saldo += valor;
			return true;
		}
		else {
		System.out.println("Erro valor nao pode ser negativo");	
		return false;
		}
		
	}
	
	public boolean saca(double valor) {
		if(valor <= this.saldo && valor > 0) {
			this.saldo -= valor;
			return true;
		}
		else {
			System.out.println("Valor insuficiente");
			return false;
		}
	}
	
	public boolean transfere(Conta destino, double valor) {
		if(valor <= this.saldo && valor > 0) {
			this.saca(valor);
			 destino.deposita(valor);
			 return true;
		}
		else {
			System.out.println("Valor insuficiente");
			 return false;
		}
		
	}
	
	
}
