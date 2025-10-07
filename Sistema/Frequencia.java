package Sist;

import java.time.LocalDate;

public class Frequencia {
    private LocalDate data;
    private boolean presente;
    private Professor professor;

    public Frequencia(LocalDate data, boolean presente, Professor professor) {
        this.data = data;
        this.presente = presente;
        this.professor = professor;
    }
}
