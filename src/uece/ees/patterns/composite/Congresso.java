package uece.ees.patterns.composite;


public class Congresso {

	public String nome;
	public int totalAssentos;
	public int participantes;

	public Congresso(String nome, int totalAssentos) {
		super();
		this.nome = nome;
		this.totalAssentos = totalAssentos;
	}

	public int getTotalParticipantes() {
		return totalAssentos - participantes;
	}

	public void adicionarParticipante(Participante participante) {
		if (getTotalParticipantes() > 0) {
			participantes++;
		}

	}

	public void imprimeParticipantes() {
		System.out.println("Participantes:");
	}

}
