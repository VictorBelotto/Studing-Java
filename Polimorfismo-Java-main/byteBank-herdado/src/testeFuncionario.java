
public class testeFuncionario {

	public static void main(String[] args) {
		Gerente victor = new Gerente();
		victor.setNome("Victor Belotto");
		victor.setCpf("1598978978");
		victor.setSalario(2600);
		
		System.out.println(victor.getNome());
		System.out.println(victor.getBonificacao());
		
	}
	
}
