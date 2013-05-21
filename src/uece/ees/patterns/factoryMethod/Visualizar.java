package uece.ees.patterns.factoryMethod;

public class Visualizar {
	public void Visualizar() {
		// TODO Auto-generated constructor stub
		Imagem imagem = new Imagem();
		imagem.carregar();
		imagem.exibir();
		imagem.fechar();
	}
}
