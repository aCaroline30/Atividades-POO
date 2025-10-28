package AtendimentoMedico;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class FilaAtendimento {

    private PriorityQueue<Paciente> fila = new PriorityQueue<>(
            Comparator.comparingInt(p -> p.getClassificacao().getPrioridade())
    );

    private List<RegistroAtendimento> historicoAtendimentos = new ArrayList<>();
    private List<Medico> medicos = new ArrayList<>();
    private HistoricoCompleto historicoCompleto;

    public FilaAtendimento(HistoricoCompleto historicoCompleto) {
        this.historicoCompleto = historicoCompleto;
        carregarMedicosIniciais();
    }

    // adiciona paciente na fila
    public void adicionarPaciente(Paciente p) {
        if (p == null) return;
        fila.offer(p);
        System.out.println("Paciente " + p.getNome() + " (" + p.getClassificacao().getTipo() + ") adicionado.");
    }

    // Simula uma rodada: cada médico atende um paciente (se houver)
    public void atenderPacientesSimultaneamente() {
        if (fila.isEmpty()) {
            System.out.println("Nenhum paciente aguardando na fila.");
            return;
        }
        if (medicos.isEmpty()) {
            System.out.println("Nenhum médico disponível.");
            return;
        }

        System.out.println("\n--- Iniciando rodada de atendimentos ---");
        for (Medico medico : medicos) {
            if (fila.isEmpty()) break;
            Paciente paciente = fila.poll();
            if (paciente == null) break;

            // registrar no paciente (preenche horário e histórico individual)
            paciente.registrarAtendimento(medico);

            // criar registro central e salvar
            RegistroAtendimento registro = new RegistroAtendimento(paciente, medico, LocalDateTime.now());
            historicoAtendimentos.add(registro);
            historicoCompleto.adicionarRegistro(registro);

            System.out.println("Médico " + medico.getNome() + " atendeu " + paciente.getNome()
                    + " [" + paciente.getClassificacao().getTipo() + "]");
        }
        System.out.println("--- Rodada finalizada ---\n");
    }

    // mostra fila ordenada (sem remover)
    public void mostrarFila() {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia!");
            return;
        }
        System.out.println("\n--- Fila de Atendimento (ordem de prioridade) ---");
        List<Paciente> ordenados = fila.stream()
                .sorted(Comparator.comparingInt(p -> p.getClassificacao().getPrioridade()))
                .collect(Collectors.toList());
        int i = 1;
        for (Paciente p : ordenados) {
            System.out.println(i++ + "º - " + p.getNome() + " | " + p.getClassificacao().getTipo() +
                    " | Chegada: " + p.getHorarioChegada());
        }
    }

    // mostra histórico do dia (global)
    public void mostrarHistoricoAtendimentos() {
        if (historicoAtendimentos.isEmpty()) {
            System.out.println("Nenhum atendimento realizado ainda.");
            return;
        }
        System.out.println("\n--- Histórico Local (rodada/dia) ---");
        for (RegistroAtendimento r : historicoAtendimentos) {
            System.out.println(r);
        }
    }

    // consulta prontuário individual por nome (procura em histórico global)
    public void consultarHistoricoPaciente(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome inválido.");
            return;
        }
        String busca = nome.trim().toLowerCase();
        boolean encontrado = false;

        // Procurar nos registros do HistoricoCompleto
        for (RegistroAtendimento r : historicoCompleto.getRegistros()) {
            if (r.getPaciente().getNome().toLowerCase().equals(busca)) {
                if (!encontrado) {
                    System.out.println("\n--- Histórico de " + nome + " ---");
                    encontrado = true;
                }
                System.out.println(r);
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum registro encontrado para: " + nome);
        }
    }

    // adiciona alguns médicos iniciais
    private void carregarMedicosIniciais() {
        medicos.add(new Medico("Dr. João", "Clínico Geral"));
        medicos.add(new Medico("Dra. Ana", "Pediatra"));
        medicos.add(new Medico("Dr. Carlos", "Cardiologista"));
        medicos.add(new Medico("Dra. Beatriz", "Ortopedista"));
    }

    public void mostrarMedicos() {
        if (medicos.isEmpty()) {
            System.out.println("Nenhum médico cadastrado.");
            return;
        }
        System.out.println("\n--- Médicos Disponíveis ---");
        for (Medico m : medicos) {
            System.out.println(m);
        }
    }

    // popula fila com 20 pacientes iniciais
    public void carregarPacientesIniciais() {
        String[] nomes = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo", "Fernanda",
                "Gabriel", "Helena", "Igor", "Julia", "Kleber", "Larissa", "Marcos",
                "Nina", "Otávio", "Paula", "Rafaela", "Sandro", "Tatiane", "Victor"};

        String[] queixas = {
                "dor forte no peito", "febre alta", "tosse", "falta de ar",
                "sangramento", "dor leve", "mal-estar", "náusea",
                "queda", "dor abdominal", "parada respiratória",
                "corte profundo", "tontura", "dor de cabeça",
                "enjoo", "fraqueza", "desmaio", "alergia", "dor muscular", "coceira"
        };

        for (int i = 0; i < 20; i++) {
            String nome = i < nomes.length ? nomes[i] : "Paciente" + (i+1);
            String queixa = i < queixas.length ? queixas[i] : "queixa genérica";
            Paciente p = new Paciente(nome, queixa, "Histórico genérico", "Nenhuma", "Nenhum");
            adicionarPaciente(p);
        }

        System.out.println("\n20 pacientes carregados automaticamente.\n");
    }
}