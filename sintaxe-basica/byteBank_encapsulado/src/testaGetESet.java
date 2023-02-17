
public class testaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1020, 99887);
		
		Cliente victor = new Cliente();
		victor.setNome("Victor Belotto");
		conta.setTitular(victor);
		
		System.out.println(conta.getTitular().getNome());
		
		
		
		
	}
	
	
}
