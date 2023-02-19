
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Senha correta para: " + fa);
			return;
		}
		System.out.println("Senha incorreta para: " +  fa);
	}
	
}
