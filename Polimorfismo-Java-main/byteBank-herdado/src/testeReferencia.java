
public class testeReferencia {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Victor");
		gerente.setSalario(5000);
		
		Funcionario funcionario = new Gerente();
		funcionario.setSalario(2000);
		
		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(funcionario);
		controle.registra(editorVideo);
		
		
		System.out.println(controle.getSoma());
	}
	
	
}
