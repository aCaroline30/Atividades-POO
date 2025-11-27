package ListaTelefonica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ContatoService {

    private final List<Contato> contatos;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ContatoService(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void adicionar(String nome, String email, String telefone, String nascimentoStr) {
        try {
            Date nasc = null;
            if (nascimentoStr != null && !nascimentoStr.trim().isEmpty()) {
                nasc = sdf.parse(nascimentoStr.trim());
            }
            contatos.add(new Contato(nome, email, telefone, nasc));
        } catch (ParseException e) {
            System.out.println("Data inválida (use dd/MM/yyyy). Contato não adicionado.");
        }
    }

    public java.util.List<Contato> listar() {
        return contatos;
    }

  
    public Contato buscarPorId(int id) {
        for (Contato c : contatos) {
            if (c.getId() == id) return c;
        }
        return null;
    }
}
