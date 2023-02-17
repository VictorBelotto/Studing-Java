
public class TesteContas {

	public static void main(String[] args) {
		
		 ContaCorrente cc = new ContaCorrente(123, 123);
		 cc.deposita(100);
		 
		 ContaPoupanca cp = new ContaPoupanca(321,  321);
		 cp.deposita(200);
		 
		 
		 
		 cc.transfere(50, cp);
		 System.out.println(cc.getSaldo());
		 System.out.println(cp.getSaldo());
		 
	}
}
