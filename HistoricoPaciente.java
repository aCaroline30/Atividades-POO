package AtendimentoMedico;

import java.util.ArrayList;
import java.util.List;

public class HistoricoPaciente {
    private List<RegistroAtendimento> registros;

    public HistoricoPaciente() {
        this.registros = new ArrayList<>();
    }

    public void adicionarRegistro(RegistroAtendimento r) {
        if (r != null) registros.add(r);
    }

    public List<RegistroAtendimento> getRegistros() {
        return registros;
    }

    public void mostrarHistorico() {
        if (registros.isEmpty()) {
            System.out.println("Nenhum atendimento registrado para este paciente.");
            return;
        }
        System.out.println("\n--- Histórico do paciente ---");
        for (RegistroAtendimento r : registros) {
            System.out.println(r);
        }
    }
}