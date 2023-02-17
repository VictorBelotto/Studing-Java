//contrato Autenticavel
	//quem assina o contrato, precisaimplementar
		//metodo senha e autentica

public abstract interface Autenticavel {

	
	
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
