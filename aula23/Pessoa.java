package aula23;

public class Pessoa {
	private String nome;

	public Pessoa (String nome) {
		setNome (nome);
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length()>3)
		this.nome = nome;
	}
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}

	
	
	

}
