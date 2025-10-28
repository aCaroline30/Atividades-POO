package AtendimentoMedico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HistoricoCompleto historicoCompleto = new HistoricoCompleto();
        FilaAtendimento fila = new FilaAtendimento(historicoCompleto);

        // Carrega pacientes iniciais (20)
        fila.carregarPacientesIniciais();

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n===== SISTEMA DE ATENDIMENTO =====");
            System.out.println("1 - Inserir novo paciente");
            System.out.println("2 - Mostrar fila de atendimento");
            System.out.println("3 - Rodada de atendimentos (médicos atendem simultaneamente)");
            System.out.println("4 - Mostrar histórico local de atendimentos");
            System.out.println("5 - Mostrar histórico completo (geral)");
            System.out.println("6 - Consultar histórico de um paciente");
            System.out.println("7 - Mostrar médicos disponíveis");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("Entrada inválida. Digite um número.");
                continue;
            }
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Queixa principal: ");
                    String queixa = sc.nextLine();
                    System.out.print("Histórico médico: ");
                    String historicoMedico = sc.nextLine();
                    System.out.print("Alergias: ");
                    String alergias = sc.nextLine();
                    System.out.print("Medicamentos contínuos: ");
                    String meds = sc.nextLine();

                    Paciente novo = new Paciente(nome, queixa, historicoMedico, alergias, meds);
                    fila.adicionarPaciente(novo);
                    break;

                case 2:
                    fila.mostrarFila();
                    break;

                case 3:
                    fila.atenderPacientesSimultaneamente();
                    break;

                case 4:
                    fila.mostrarHistoricoAtendimentos();
                    break;

                case 5:
                    historicoCompleto.mostrarHistoricoGeral();
                    break;

                case 6:
                    System.out.print("Digite o nome do paciente: ");
                    String busca = sc.nextLine();
                    fila.consultarHistoricoPaciente(busca);
                    break;

                case 7:
                    fila.mostrarMedicos();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}