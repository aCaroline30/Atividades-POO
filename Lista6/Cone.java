package Lista6;

public class Cone {
	
	 private static final double PI = 3.14;
	    private static final double RENDIMENTO = 3.45; 
	    private static final double LITROS_LATA = 18.0;

	    private static final double[] PRECO_TINTAS = {238.90, 467.98, 758.34};

	   
	    private double raio;
	    private double altura;
	    private int nivelTinta;

	
	    public Cone() {}

	    public Cone(double raio, double altura, int nivelTinta) {
	        this.raio = raio;
	        this.altura = altura;
	        this.nivelTinta = nivelTinta;
	    }

	    public Cone(Cone outro) {
	        this.raio = outro.raio;
	        this.altura = outro.altura;
	        this.nivelTinta = outro.nivelTinta;
	    }

	  
	    public double calcularGeratriz() {
	        return Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
	    }

	    public double calcularAreaFundo() {
	        return PI * Math.pow(raio, 2);
	    }

	    public double calcularAreaLateral() {
	        return PI * raio * calcularGeratriz();
	    }

	    public double calcularAreaTotal() {
	        return calcularAreaFundo() + calcularAreaLateral();
	    }

	    public double calcularLitros() {
	        return calcularAreaTotal() * RENDIMENTO;
	    }

	    public int calcularLatas() {
	        return (int) Math.ceil(calcularLitros() / LITROS_LATA);
	    }

	    public double calcularPrecoTotal() {
	        return calcularLatas() * PRECO_TINTAS[nivelTinta - 1];
	    }

	
	    @Override
	    public String toString() {
	        return "– Cone\n" +
	               "Raio: " + raio + "\n" +
	               "Altura: " + altura + "\n" +
	               "Nível: " + nivelTinta + "\n" +
	               "—————————–\n" +
	               "Geratriz: " + calcularGeratriz() + "\n" +
	               "—————————–\n" +
	               "Área do Fundo: " + calcularAreaFundo() + "\n" +
	               "Área Lateral Cone: " + calcularAreaLateral() + "\n" +
	               "Área Total: " + calcularAreaTotal() + "\n" +
	               "—————————–\n" +
	               "Litros: " + calcularLitros() + "\n" +
	               "Latas: " + calcularLatas() + "\n" +
	               "—————————–\n" +
	               "Preço Total: " + calcularPrecoTotal() + "\n";
	    }
	
	
	
}
