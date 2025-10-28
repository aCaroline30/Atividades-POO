package AtendimentoMedico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Paciente {
    private String nome;
    private String queixaPrincipal;
    private String historicoMedico;
    private String alergias;
    private String medicamentosContinuos;
    private Classificacao classificacao;
    private LocalDateTime horarioChegada;
    private LocalDateTime horarioAtendimento; // do último atendimento
    private Medico medicoAtendente;           // do último atendimento
    private HistoricoPaciente historicoPaciente = new HistoricoPaciente();

    public Paciente(String nome, String queixa, String historicoMedico, String alergias, String medicamentosContinuos) {
        this.nome = nome != null ? nome.trim() : "SemNome";
        this.queixaPrincipal = queixa != null ? queixa.trim() : "";
        this.historicoMedico = historicoMedico != null ? historicoMedico.trim() : "";
        this.alergias = alergias != null ? alergias.trim() : "";
        this.medicamentosContinuos = medicamentosContinuos != null ? medicamentosContinuos.trim() : "";
        this.classificacao = Classificacao.definirClassificacao(this.queixaPrincipal);
        this.horarioChegada = LocalDateTime.now();
    }

    // Getters
    public String getNome() { return nome; }
    public String getQueixaPrincipal() { return queixaPrincipal; }
    public Classificacao getClassificacao() { return classificacao; }
    public LocalDateTime getHorarioChegada() { return horarioChegada; }
    public LocalDateTime getHorarioAtendimento() { return horarioAtendimento; }
    public Medico getMedicoAtendente() { return medicoAtendente; }
    public HistoricoPaciente getHistoricoPaciente() { return historicoPaciente; }

    // Registra atendimento: preenche horário, médico e adiciona registro no historicoPaciente
    public void registrarAtendimento(Medico medico) {
        this.horarioAtendimento = LocalDateTime.now();
        this.medicoAtendente = medico;
        RegistroAtendimento registro = new RegistroAtendimento(this, medico, horarioAtendimento);
        this.historicoPaciente.adicionarRegistro(registro);
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [nome=");
		builder.append(nome);
		builder.append(", queixaPrincipal=");
		builder.append(queixaPrincipal);
		builder.append(", historicoMedico=");
		builder.append(historicoMedico);
		builder.append(", alergias=");
		builder.append(alergias);
		builder.append(", medicamentosContinuos=");
		builder.append(medicamentosContinuos);
		builder.append(", classificacao=");
		builder.append(classificacao);
		builder.append(", horarioChegada=");
		builder.append(horarioChegada);
		builder.append(", horarioAtendimento=");
		builder.append(horarioAtendimento);
		builder.append(", medicoAtendente=");
		builder.append(medicoAtendente);
		builder.append(", historicoPaciente=");
		builder.append(historicoPaciente);
		builder.append("]");
		return builder.toString();
	}

  
}