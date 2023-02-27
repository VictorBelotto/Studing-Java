
public class TesteSaca {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente(123, 123);
		cc.deposita(200);
		
		try {
			cc.saca(210);
		}catch(SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}

		
		
		System.out.println(cc.getSaldo());
	}

}
