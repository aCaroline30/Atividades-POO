package Sist;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int matricula;
    private List<Matricula> matriculas = new ArrayList<>();

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void matricular(Disciplina disciplina) {
        matriculas.add(new Matricula(this, disciplina));
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }
}
