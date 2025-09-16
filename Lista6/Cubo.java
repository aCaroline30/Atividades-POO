package Lista6;

public class Cubo {
	
	  private static final double LITROS_LATA = 18.0;
	    private static final double[] PRECO_TINTAS = {101.90, 212.45, 345.56};

	   
	    private double lado;
	    private double rendimento; 
	    private int tipoTinta;    

	 
	    public Cubo() {}

	    public Cubo(double lado, double rendimento, int tipoTinta) {
	        setLado(lado);
	        setRendimento(rendimento);
	        setTipoTinta(tipoTinta);
	    }

	    public Cubo(Cubo outro) {
	        this.lado = outro.lado;
	        this.rendimento = outro.rendimento;
	        this.tipoTinta = outro.tipoTinta;
	    }

	   
	    public double getLado() { return lado; }
	    public void setLado(double lado) {
	        if (lado <= 0) throw new IllegalArgumentException("O lado deve ser positivo.");
	        this.lado = lado;
	    }

	    public double getRendimento() { return rendimento; }
	    public void setRendimento(double rendimento) {
	        if (rendimento <= 0) throw new IllegalArgumentException("O rendimento deve ser positivo.");
	        this.rendimento = rendimento;
	    }

	    public int getTipoTinta() { return tipoTinta; }
	    public void setTipoTinta(int tipoTinta) {
	        if (tipoTinta < 1 || tipoTinta > 3) throw new IllegalArgumentException("Tipo de tinta inválido.");
	        this.tipoTinta = tipoTinta;
	    }

	  
	    public double calcularAreaBase() {
	        return lado * lado;
	    }

	    public double calcularAreaTotal() {
	        return 6 * calcularAreaBase();
	    }

	    public double calcularVolume() {
	        return Math.pow(lado, 3);
	    }

	    public double calcularDiagonal() {
	        return lado * Math.sqrt(3);
	    }

	    public double calcularLitros() {
	        return calcularAreaTotal() / rendimento;
	    }

	    public int calcularLatas() {
	        return (int) Math.ceil(calcularLitros() / LITROS_LATA);
	    }

	    public double calcularPrecoTotal() {
	        return calcularLatas() * PRECO_TINTAS[tipoTinta - 1];
	    }

	   
	    @Override
	    public String toString() {
	        return "a : " + lado + "\n" +
	               "Redimento : " + rendimento + "\n" +
	               "Tipo de Tinta : " + tipoTinta + "\n" +
	               "————————–\n" +
	               "Área da Base : " + calcularAreaBase() + "\n" +
	               "Área Total : " + calcularAreaTotal() + "\n" +
	               "Volume : " + calcularVolume() + "\n" +
	               "Diagonal do Cubo : " + calcularDiagonal() + "\n" +
	               "Litros de Tinta: " + calcularLitros() + "\n" +
	               "Latas de Tinta: " + calcularLatas() + "\n" +
	               "Valor Total: " + calcularPrecoTotal() + "\n";
	    }
}
