package AtendimentoMedico;

public class Classificacao {
    private String tipo;    // "Vermelho", "Amarelo", ...
    private String descricao;
    private int prioridade; // 1 = mais urgente

    public Classificacao(String tipo, String descricao, int prioridade) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public String getTipo() { return tipo; }
    public String getDescricao() { return descricao; }
    public int getPrioridade() { return prioridade; }

   
    

    @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Classificacao [tipo=");
		builder.append(tipo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", prioridade=");
		builder.append(prioridade);
		builder.append("]");
		return builder.toString();
	}

	// Método utilitário para definir classificação a partir da queixa
    public static Classificacao definirClassificacao(String queixa) {
        if (queixa == null) queixa = "";
        String q = queixa.toLowerCase();

        if (q.contains("parada") || q.contains("inconsciente") || q.contains("sem pulso") || q.contains("dor forte no peito"))
            return new Classificacao("Vermelho", "Atendimento imediato", 1);
        else if (q.contains("sangramento") || q.contains("queda") || q.contains("falta de ar") || q.contains("desmaio"))
            return new Classificacao("Amarelo", "Urgente (até 20 min)", 2);
        else if (q.contains("febre") || q.contains("tosse") || q.contains("dor") || q.contains("tontura"))
            return new Classificacao("Verde", "Pouco urgente (até 2h)", 3);
        else
            return new Classificacao("Azul", "Não urgente (até 3h)", 4);
    }
}