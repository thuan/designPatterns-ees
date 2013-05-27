package uece.ees.patterns.composite;

public class Congresso {

	public String nome;
	public int totalAssentos;
	public int totalParticipantes;

	public int getTotalParticipantes() {
		return totalParticipantes;
	}

	public void adicionarParticipante(Participante participante) {
		if (totalAssentos >= totalParticipantes) {
			participante.adicionar(participante);
			totalParticipantes++;
		} else {
			System.err.println("Error - Congresso Cheio");
		}
	}

	public void imprimeParticipantes() {
		System.out.println("Total de participantes:" + totalParticipantes);
	}

}
