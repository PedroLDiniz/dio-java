
public class TesteIphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Iphone iphone = new Iphone();
			
			iphone.ligar("11912-123123");
			iphone.adicionarNovaAba();
			iphone.atender();
			iphone.iniciarCorreioVoz();
			iphone.tocar();
			iphone.exibirPagina("www.fiap.com.br");
			iphone.iniciarCorreioVoz();
			iphone.adicionarNovaAba();
			iphone.atualizarPagina();
			iphone.SelecionarMusica("Fade to black");
			iphone.tocar();
			iphone.pausar();
			iphone.SelecionarMusica("Master of Puppets");
			iphone.tocar();
			iphone.ligar("11-123123-123123");
			
	}

}
