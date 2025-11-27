package ListaTelefonica;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Contato {

    private static int idMax = 1;
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private Date nascimento;

    private static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");

   
    public Contato(String nome, String email, String telefone, Date nascimento) {
        this.id = idMax++;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.nascimento = nascimento;
    }

   
    public Contato(int id, String nome, String email, String telefone, Date nascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.nascimento = nascimento;
        if (id >= idMax) {
            idMax = id + 1;
        }
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public Date getNascimento() { return nascimento; }

   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(",");
        sb.append(nullSafe(nome)).append(",");
        sb.append(nullSafe(email)).append(",");
        sb.append(nullSafe(telefone)).append(",");
        sb.append(nascimento != null ? SDF.format(nascimento) : "");
        return sb.toString();
    }

    private String nullSafe(String s) {
        return s == null ? "" : s.replace(",", " "); 
    }
}
