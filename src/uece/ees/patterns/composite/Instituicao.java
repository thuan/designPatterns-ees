package uece.ees.patterns.composite;

import java.util.ArrayList;

public class Instituicao extends Participante {
	private ArrayList<Individuo> membros;

	public Instituicao(String nome) {
		super.nome = nome;
	}

	@Override
	public void adicionar(Participante participante) {
		participante.adicionar(new Instituicao(nome));
		membros.add(new Individuo(getNome(), getAssento()));

	}

	@Override
	public void remover(Participante participante) {
		participante.remover(new Instituicao(nome));
		membros.remove(new Individuo(getNome(), getAssento()));
	}

	public void imprimeMembros() {
		System.out.println(membros);
	}
}
