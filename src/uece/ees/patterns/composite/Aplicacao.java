package uece.ees.patterns.composite;

public class Aplicacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// criando congresso
		
		Congresso congresso = new Congresso("Congresso",100);
		
		// adicionando participantes(individuoes e instituiçoes)
		
		Participante alunosParticipantes = new ParticipanteComposite(new Instituicao("IFCE"));
		alunosParticipantes.adicionar(new Individuo("Aluno1", 1));
		alunosParticipantes.adicionar(new Individuo("Aluno2", 2));
		congresso.adicionarParticipante(alunosParticipantes);
		
		// mostrar listagem de todos inscritos
		
		congresso.imprimeParticipantes();
		
		// se o congresso estiver cheio nao e permitido inserir mais participantess
		
	}

}
