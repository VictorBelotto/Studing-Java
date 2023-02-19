
public class testeSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.getSaldo());
				
		
		// proibido acessar as atribuições, apenas por metodo
		
	}
	
}
