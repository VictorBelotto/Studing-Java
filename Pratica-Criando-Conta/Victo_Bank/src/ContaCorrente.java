
public class ContaCorrente extends Conta implements Titular{

	private Cliente titular;
	
	@Override
	public String getNome() {
		return this.titular.getNome();
	}

	@Override
	public void setNome(String nome) {
		this.titular.setNome(nome);
		
	}

	@Override
	public int getCpf() {
		return this.titular.getCpf();
	}

	@Override
	public void setCpf(int cpf) {
		this.titular.setCpf(cpf);
		
	}




}