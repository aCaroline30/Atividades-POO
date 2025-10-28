package AtendimentoMedico;

import java.util.ArrayList;
import java.util.List;

public class HistoricoCompleto {
    private List<RegistroAtendimento> registros;

    public HistoricoCompleto() {
        this.registros = new ArrayList<>();
    }

    public synchronized void adicionarRegistro(RegistroAtendimento r) {
        if (r != null) registros.add(r);
    }

    public List<RegistroAtendimento> getRegistros() {
        return registros;
    }

    public void mostrarHistoricoGeral() {
        if (registros.isEmpty()) {
            System.out.println("Nenhum atendimento registrado no histórico geral.");
            return;
        }
        System.out.println("\n=== Histórico Geral de Atendimentos ===");
        for (RegistroAtendimento r : registros) {
            System.out.println(r);
        }
    }
}
