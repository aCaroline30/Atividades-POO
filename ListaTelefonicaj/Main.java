package ListaTelefonicaj;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;


public class Main {

public static void main(String[] args) {
StringBuilder sb = new StringBuilder();
    String nomeArquivo = "C:\\Users\\Usuário\\Desktop\\teste2.csv";
    Scanner scan = new Scanner(System.in);
    List<Contato> agenda = new ArrayList<Contato>();
   
    String resposta="";
       
       //ler
       try (BufferedReader bw = new BufferedReader(new FileReader(nomeArquivo))) {
        int count=1;
        String linha;
        while ((linha = bw.readLine()) != null) {
        System.out.println(linha);
        sb.append(linha+"\n");
        count++;
           }
        Contato.idMax = count;
       } catch (IOException e) {
           e.printStackTrace();
       }
       
       System.out.println("deseja adicionar contato (y/n)");
       scan.reset();
       resposta = scan.nextLine();
       while (resposta.equals("y")) {
        System.out.println("nome:");
        String nome = scan.nextLine();
        System.out.println("email:");
        String email = scan.nextLine();
        System.out.println("telefone:");
        String telefone = scan.nextLine();        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data de nascimento:");
        String nasc = scan.nextLine();
        try {
        Date data = formato.parse(nasc);
        agenda.add(new Contato(nome,email,telefone,data));
        } catch (ParseException e) {
               System.out.println("Erro ao formatar a data. Verifique o formato.");
           }
        System.out.println("deseja adicionar contato (y/n)");
        resposta = scan.nextLine();
       }
       
       for(int i =0; i < agenda.size(); i++) {
        sb.append(agenda.get(i).toString()+"\n");
       }
       
       //salvar
       try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {
           bw.write(sb.toString());
           System.out.println("Arquivo CSV salvo com sucesso!");
       } catch (IOException e) {
           e.printStackTrace();
       }
}
}
