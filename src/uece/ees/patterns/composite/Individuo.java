package uece.ees.patterns.composite;

public class Individuo extends Participante {
	private int assento;

	public Individuo(String nome, int assento) {
		super.nome = nome;
		this.assento = assento;
	}

	public int getAssento() {
		return assento;
	}
	
}
