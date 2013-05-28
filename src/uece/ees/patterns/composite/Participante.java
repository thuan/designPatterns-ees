package uece.ees.patterns.composite;

public abstract class Participante {

	protected String nome;

	public String getNome() {
		return nome;
	}

	public int getAssento() {
		return getAssento();
	}

	public abstract void adicionar(Participante participante);

	public abstract void remover(Participante participante);

}
