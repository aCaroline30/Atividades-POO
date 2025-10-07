package Sist;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String codigo;
    private List<Fase> fases = new ArrayList<>();

    public Curso(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void adicionarFase(Fase fase) {
        fases.add(fase);
    }

    public List<Fase> getFases() {
        return fases;
    }
}
