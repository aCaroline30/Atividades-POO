package Sist;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Engenharia de Software", "ES2025");
        Fase fase1 = new Fase(1);

        Disciplina poo = new Disciplina("Programação Orientada a Objetos", "POO101");
        Professor prof1 = new Professor("Carlos", 1);
        poo.adicionarProfessor(prof1);

        fase1.adicionarDisciplina(poo);
        curso.adicionarFase(fase1);

        Aluno aluno = new Aluno("Hanna", 12345);
        aluno.matricular(poo);

        Matricula m = aluno.getMatriculas().get(0);
        m.registrarFrequencia(new Frequencia(LocalDate.now(), true, prof1));
        m.registrarAvaliacao(new Avaliacao(8.5, prof1));
        m.setSituacao(Situacao.APROVADO);

        System.out.println("Aluno " + aluno.getMatriculas().get(0).getSituacao());
    }
}

////www.plantuml.com/plantuml/png/XL9DQzmm4BthLmov108EFHSA4Lul69oriKElOI9D5u4-KdtqKlg7-ZVwnsevhbLCDhk7vVczUK_Ip3o4Y3ucerbKKHDCAaGo25oW_FFRAE6WWeF2iyUPbGIrnX0eC7RxvUAFtG90tV5fQYOOnlPKjmDlfmyjJEHWg9CF3duoWCewG_0PfkYLFMT2EAdEhb2__fcE66Zr94C-boWRYtvGGQXNhInUIowK-qO-eiIPV75E4zgID_XP3S7v2t5Axc_0TRANdcLmXY9ft9iUDs4n1XKJ2dJPlC9IU_JqFP4LQYsM67DUvmJg0qRAtAkdG3RIUq_YFr0h5BXTSh5BbruqvIgooQp7hZLy6Fkl_D3FS6pUmSz3FpuVUVV4i__QjenDn-ksF_77vlJKNrcLjoMvgwfbyYp_BLzbpgn0S5LL9lQ_SFFf_lxk9kkbrMn3ER6qTIUKVXK-1xqDcXNRxlJDjkCVoCfaz5y0
