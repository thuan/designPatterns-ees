package uece.ees.patterns.composite;

public class Aplicacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// criando congresso
		Congresso congresso = new Congresso();
		// adicionando participantes(individuoes e instituiçoes)
		Participante instituicaoCongresso = new Instituicao("IFCE");
		Participante individuoCongresso = new Individuo("Participante1", 1);
		Participante individuo = new ParticipanteComposite(new Individuo("Participante2", 2));
		individuo.adicionar(individuoCongresso);
		individuo.adicionar(individuo);
		
		// mostrar listagem de todos inscritos
		congresso.imprimeParticipantes();
		// se o congresso estiver cheio nao e permitido inserir mais participantess
	}

}
