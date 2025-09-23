package aula23;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	
	public PessoaFisica (String nome) {
		super(nome);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf.length()>10)
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", toString()=" + super.toString() + "]";
	}

	
}
