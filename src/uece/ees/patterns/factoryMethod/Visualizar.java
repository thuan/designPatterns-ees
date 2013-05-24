package uece.ees.patterns.factoryMethod;

public class Visualizar {
	public Visualizar() {
		Imagem imagem = new Imagem();
		imagem.carregar();
		imagem.exibir();
		imagem.fechar();
	}
}
