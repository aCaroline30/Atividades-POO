package ListaTelefonica;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContatoCSV {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

   
    public static List<Contato> carregar(String caminhoOriginal) {
        List<Contato> contatos = new ArrayList<>();
        File arquivo = new File(caminhoOriginal);

       
        if (!arquivo.exists()) {
            try {
                File parent = arquivo.getParentFile();
                if (parent != null && !parent.exists()) {
                    parent.mkdirs(); 
                }
                boolean criado = arquivo.createNewFile();
                System.out.println("Arquivo não existia. Criado: " + arquivo.getAbsolutePath() + " (criado=" + criado + ")");
            } catch (IOException e) {
                System.out.println("Não foi possível criar o arquivo no caminho informado: " + e.getMessage());
                // fallback
                arquivo = new File("contatos.csv");
                try {
                    boolean criado = arquivo.createNewFile();
                    System.out.println("Usando arquivo fallback: " + arquivo.getAbsolutePath() + " (criado=" + criado + ")");
                } catch (IOException ex) {
                    System.out.println("Falha ao criar arquivo fallback: " + ex.getMessage());
                    return contatos; 
                }
            }
        }

   
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linha = linha.trim();
                if (linha.isEmpty()) continue;

           
                String[] partes = linha.split(",", -1); 
                if (partes.length < 5) {
                  
                    System.out.println("Linha do CSV ignorada (malformada): " + linha);
                    continue;
                }

                try {
                    int id = Integer.parseInt(partes[0].trim());
                    String nome = partes[1].trim();
                    String email = partes[2].trim();
                    String telefone = partes[3].trim();
                    String nascStr = partes[4].trim();
                    Date nasc = null;
                    if (!nascStr.isEmpty()) {
                        nasc = sdf.parse(nascStr);
                    }
                    contatos.add(new Contato(id, nome, email, telefone, nasc));
                } catch (NumberFormatException | ParseException e) {
                    System.out.println("Erro ao interpretar linha e foi ignorada: " + linha + " -> " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        return contatos;
    }

   
  
    public static void salvar(String caminhoOriginal, List<Contato> contatos) {
        File arquivo = new File(caminhoOriginal);
       
        try {
            File parent = arquivo.getParentFile();
            if (parent != null && !parent.exists()) parent.mkdirs();
            if (!arquivo.exists()) arquivo.createNewFile();
        } catch (IOException e) {
            System.out.println("Não foi possível preparar o arquivo no caminho informado: " + e.getMessage());
            arquivo = new File("contatos.csv");
            try {
                if (!arquivo.exists()) arquivo.createNewFile();
                System.out.println("Usando arquivo fallback para salvar: " + arquivo.getAbsolutePath());
            } catch (IOException ex) {
                System.out.println("Falha ao preparar arquivo fallback para salvar: " + ex.getMessage());
                return;
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Contato c : contatos) {
                bw.write(c.toString());
                bw.newLine();
            }
            System.out.println("Arquivo salvo com sucesso em: " + arquivo.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }
}


