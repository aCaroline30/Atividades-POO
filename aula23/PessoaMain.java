package aula23;

public class PessoaMain {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Rodrigo");
		
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica("Rodrigo");
		pf.setCpf("111.222.333-45");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("Rodrigo");
		pj.setCNPJ("111.222.333-45");
		System.out.println(pj);
	}

}

	