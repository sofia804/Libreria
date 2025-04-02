public class LibroImpreso extends Libro{
    private double peso;

    public LibroImpreso(String titulo, String autor, int precio, double peso) {
        super(titulo, autor, precio);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("  Peso: " + peso);
    }
}
