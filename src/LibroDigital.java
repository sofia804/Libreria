public class LibroDigital extends Libro{
    private double tamanioArchivo;

    public LibroDigital(String titulo, String autor, int precio, double tamanioArchivo) {
        super(titulo, autor, precio);
        this.tamanioArchivo = tamanioArchivo;
    }

    public double getTamanioArchivo() {
        return tamanioArchivo;
    }

    public void setTamanioArchivo(double tamanioArchivo) {
        this.tamanioArchivo = tamanioArchivo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println(" Tamaño Archivo:" + tamanioArchivo);
    }
}
