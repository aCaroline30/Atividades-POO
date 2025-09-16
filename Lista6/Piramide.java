package Lista6;

public class Piramide {
	  
    private static final double RENDIMENTO = 4.76; 
    private static final double LITROS_LATA = 18.0;
    private static final double[] PRECO_TINTAS = {127.90, 258.98, 344.34};

    
    private double ab; 
    private double h; 
    private int tipoTinta; 

    
    public Piramide() {}

    public Piramide(double ab, double h, int tipoTinta) {
        setAb(ab);
        setH(h);
        setTipoTinta(tipoTinta);
    }

    public Piramide(Piramide outra) {
        this.ab = outra.ab;
        this.h = outra.h;
        this.tipoTinta = outra.tipoTinta;
    }

   
    public double getAb() { return ab; }
    public void setAb(double ab) {
        if (ab <= 0) throw new IllegalArgumentException("O lado deve ser positivo.");
        this.ab = ab;
    }

    public double getH() { return h; }
    public void setH(double h) {
        if (h <= 0) throw new IllegalArgumentException("A altura deve ser positiva.");
        this.h = h;
    }

    public int getTipoTinta() { return tipoTinta; }
    public void setTipoTinta(int tipoTinta) {
        if (tipoTinta < 1 || tipoTinta > 3) throw new IllegalArgumentException("Tipo de tinta inválido.");
        this.tipoTinta = tipoTinta;
    }

    
    public double calcularA1() {
        return Math.sqrt(Math.pow(ab / 2.0, 2) + Math.pow(h, 2));
    }

    public double calcularAreaTriangulo() {
        return (ab * calcularA1()) / 2.0;
    }

    public double calcularAreaBase() {
        return ab * ab;
    }

    public double calcularAreaTotal() {
        return calcularAreaBase() + 4 * calcularAreaTriangulo();
    }

    public double calcularVolume() {
        return (1.0 / 3.0) * calcularAreaBase() * h;
    }

    public double calcularLitros() {
        return calcularAreaTotal() / RENDIMENTO;
    }

    public int calcularLatas() {
        return (int) Math.ceil(calcularLitros() / LITROS_LATA);
    }

    public double calcularPreco() {
        return calcularLatas() * PRECO_TINTAS[tipoTinta - 1];
    }

    
    @Override
    public String toString() {
        return "ab: " + ab + "\n" +
               "h: " + h + "\n" +
               "a1: " + calcularA1() + "\n" +
               "Área Triângulo: " + calcularAreaTriangulo() + "\n" +
               "Área Base: " + calcularAreaBase() + "\n" +
               "Área Total: " + calcularAreaTotal() + "\n" +
               "Tipo de Tinta: " + tipoTinta + "\n" +
               "Litros: " + calcularLitros() + "\n" +
               "Latas: " + calcularLatas() + "\n" +
               "Preço: " + calcularPreco() + "\n" +
               "Volume: " + calcularVolume() + "\n";
    }
}
