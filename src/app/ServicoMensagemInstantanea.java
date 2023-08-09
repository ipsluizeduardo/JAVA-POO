package app;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//public abstract void  salvarHistoricoMenssagem();
	
	protected void validarConectadoInternet() {
		System.out.println("Validando se esta conectado a internet");
	}
}
