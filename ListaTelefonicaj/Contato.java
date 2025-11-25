package ListaTelefonicaj;


import java.util.Date;

public class Contato {

	public static int idMax=1;
	private int id;
	private String nome, email, telefone;
	private Date nasc;


	public Contato(String nome, String email, String telefone, Date nasc) {
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
	this.nasc = nasc;
	this.id = idMax;
	idMax++;
	}

	public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append(id);
	builder.append(", ");
	builder.append(nome);
	builder.append(", ");
	builder.append(email);
	builder.append(", ");
	builder.append(telefone);
	builder.append(", ");
	builder.append(nasc);
	return builder.toString();
	}
	}

