
public class TesteConta {

	public static void main(String[] args) {
	
		Titular victor = new Cliente("Victor", 123123);
		ContaCorrente contaVictor = new ContaCorrente();
		
		contaVictor.setTitular(victor);
		
		System.out.println(contaVictor.getTitular());
		System.out.println(victor);
		
		
		
	}

}
