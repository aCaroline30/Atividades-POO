package AtendimentoMedico;

public class Medico {
    private String nome;
    private String especialidade;

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() { return nome; }
    public String getEspecialidade() { return especialidade; }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medico [nome=");
		builder.append(nome);
		builder.append(", especialidade=");
		builder.append(especialidade);
		builder.append("]");
		return builder.toString();
	}

   
}