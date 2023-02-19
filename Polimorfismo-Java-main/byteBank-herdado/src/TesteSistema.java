
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(277);
		
		Administrador adm = new Administrador();
		adm.setSenha(2222);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		
		SistemaInterno gSistema = new SistemaInterno();
		gSistema.autentica(g);
		
		SistemaInterno admSistema = new SistemaInterno();
		admSistema.autentica(adm);
		
		SistemaInterno clienteSistema = new SistemaInterno();
		clienteSistema.autentica(cliente);
		
	}
	
}
