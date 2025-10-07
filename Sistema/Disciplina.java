package Sist;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String codigo;
    private boolean ofertada;
    private List<Professor> professores = new ArrayList<>();

    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.ofertada = true;
    }

    public void adicionarProfessor(Professor p) {
        if (professores.size() < 4) {
            professores.add(p);
        }
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public boolean isOfertada() {
        return ofertada;
    }

    public void setOfertada(boolean ofertada) {
        this.ofertada = ofertada;
    }
}
