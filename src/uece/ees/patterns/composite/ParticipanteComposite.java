package uece.ees.patterns.composite;

import java.util.ArrayList;


public class ParticipanteComposite extends Participante {
	
	ArrayList<Participante> participantes = new ArrayList<Participante>();
	
	public ParticipanteComposite(Participante participantes) {
		super();
	}

	@Override
	public void adicionar(Participante participante) {
		participantes.add(participante);
	}
	
	@Override
	public void remover(Participante participante) {
		participantes.remove(participante);
	}
}
