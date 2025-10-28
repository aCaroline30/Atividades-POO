package AtendimentoMedico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroAtendimento {
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime horarioAtendimento;
    private Classificacao classificacao;
    private String queixa;

    public RegistroAtendimento(Paciente paciente, Medico medico, LocalDateTime horarioAtendimento) {
        this.paciente = paciente;
        this.medico = medico;
        this.horarioAtendimento = horarioAtendimento;
        this.classificacao = paciente.getClassificacao();
        this.queixa = paciente.getQueixaPrincipal();
    }

    public Paciente getPaciente() { return paciente; }
    public Medico getMedico() { return medico; }
    public LocalDateTime getHorarioAtendimento() { return horarioAtendimento; }
    public Classificacao getClassificacao() { return classificacao; }
    public String getQueixa() { return queixa; }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegistroAtendimento [paciente=");
		builder.append(paciente);
		builder.append(", medico=");
		builder.append(medico);
		builder.append(", horarioAtendimento=");
		builder.append(horarioAtendimento);
		builder.append(", classificacao=");
		builder.append(classificacao);
		builder.append(", queixa=");
		builder.append(queixa);
		builder.append("]");
		return builder.toString();
	}

   
}