
public class Iphone  implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("Exibindo a seguinte página: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Nova aba Adicionada >>>>>");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		
		System.out.println("Ligando para >>>" + numero);
		
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Sua chamada está sendo atendida >>>>>");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando Correio de voz....... ");
		
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Reproduzindo suas músicas favoritas...");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Musicas pausadas....");
	}

	@Override
	public void SelecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Selecionando a música >>> " + musica);
		
	}

	
}
