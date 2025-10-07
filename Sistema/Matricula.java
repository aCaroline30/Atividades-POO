package Sist;

import java.util.ArrayList;
import java.util.List;

public class Matricula {
    private Aluno aluno;
    private Disciplina disciplina;
    private Situacao situacao;
    private List<Frequencia> frequencias = new ArrayList<>();
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    public Matricula(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.situacao = Situacao.REPROVADO_POR_FALTA; // padrão inicial
    }

    public void registrarFrequencia(Frequencia f) {
        frequencias.add(f);
    }

    public void registrarAvaliacao(Avaliacao a) {
        avaliacoes.add(a);
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
}
