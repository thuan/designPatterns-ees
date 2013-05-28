package uece.ees.patterns.composite;

public class Instituicao extends Participante {
	private String membros;

	public Instituicao(String nome) {
		super.nome = nome;
	}

	public String getMembros() {
		return membros;
	}

	public void setMembros(String membros) {
		this.membros = membros;
	}

	@Override
	public void adicionar(Participante participante) {
		super.adicionar(participante);
	}

	@Override
	public void remover(Participante participante) {
		super.remover(participante);
	}

	public void imprimeMembros() {
		System.out.println("Membros:" + getMembros());
	}
}
