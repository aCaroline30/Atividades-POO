package ListaTelefonica;

import java.util.Scanner;

import java.util.List;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     
        String caminho = "C:\\Users\\Usuário\\Desktop\\teste2.csv";

        List<Contato> contatos = ContatoCSV.carregar(caminho);
        ContatoService service = new ContatoService(contatos);

        Scanner scan = new Scanner(System.in);

        System.out.println("=== CONTATOS CARREGADOS ===");
        if (contatos.isEmpty()) {
            System.out.println("(Nenhum contato encontrado)");
        } else {
            for (Contato c : contatos) {
                System.out.println(c);
            }
        }

        String resposta;
        do {
            System.out.print("Deseja adicionar contato? (y/n): ");
            resposta = scan.nextLine().trim();

            if (resposta.equalsIgnoreCase("y")) {
                System.out.print("Nome: ");
                String nome = scan.nextLine();

                System.out.print("Email: ");
                String email = scan.nextLine();

                System.out.print("Telefone: ");
                String telefone = scan.nextLine();

                System.out.print("Data de nascimento (dd/MM/yyyy) - opcional: ");
                String nasc = scan.nextLine();

                service.adicionar(nome, email, telefone, nasc);
            } else if (!resposta.equalsIgnoreCase("n")) {
                System.out.println("Resposta inválida. Digite 'y' ou 'n'.");
            }

        } while (resposta.equalsIgnoreCase("y"));

        ContatoCSV.salvar(caminho, service.listar());

        scan.close();
    }
}