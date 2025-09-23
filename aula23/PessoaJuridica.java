package aula23;

public class PessoaJuridica extends Pessoa {
	
	public PessoaJuridica(String nome) {
		super(nome);
		
	}


	private String CNPJ;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String CNPJ) {
		if (CNPJ.length()>13)
		this.CNPJ = CNPJ;
	}

	
	public String toString() {
		return "PessoaFisica [CNPJ=" + CNPJ + ", toString()=" + super.toString() +"]";
	}



}
