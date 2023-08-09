import app.FacebookMenssenger;
import app.MSNMenssenger;
import app.ServicoMensagemInstantanea;
import app.Telegram;

public  class ComputadorPedrinho {
	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "fbm";
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMenssenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMenssenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
