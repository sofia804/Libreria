import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String titulo, autor;
        int precio;
        double peso, tamanioArchivo;
        List<Libro> listaLibrosImpresos = new ArrayList<>();
        List<Libro> listaLibrosDigitales = new ArrayList<>();
        int opc;
        boolean estado = true;

        do {
            System.out.println("Librería");
            System.out.println("1. Agregar libro");
            System.out.println("2. Ver libros");
            System.out.println("3. Salir");
            System.out.print("Digite su opción: ");
            opc = teclado.nextInt();

            switch (opc) {
                case 1 -> {
                    System.out.println("Seleccione el tipo de libro: 1. Impreso 2. Digital");
                    int tipoLibro = teclado.nextInt();
                    teclado.nextLine();

                    if (tipoLibro == 1) {
                        System.out.print("Ingrese el título del libro: ");
                        titulo = teclado.nextLine();
                        System.out.print("Ingrese el autor del libro: ");
                        autor = teclado.nextLine();
                        System.out.print("Ingrese el precio del libro: ");
                        precio = teclado.nextInt();
                        System.out.print("Ingrese el peso del libro: ");
                        peso = teclado.nextDouble();
                        listaLibrosImpresos.add(new LibroImpreso(titulo, autor, precio, peso));
                    } else if (tipoLibro == 2) {
                        System.out.print("Ingrese el título del libro: ");
                        titulo = teclado.nextLine();
                        System.out.print("Ingrese el autor del libro: ");
                        autor = teclado.nextLine();
                        System.out.print("Ingrese el precio del libro: ");
                        precio = teclado.nextInt();
                        System.out.print("Ingrese el tamaño del archivo (MB): ");
                        tamanioArchivo = teclado.nextDouble();
                        listaLibrosDigitales.add(new LibroDigital(titulo, autor, precio, tamanioArchivo));
                    }
                }
                case 2 -> {
                    System.out.println("Elija el tipo de libro para ver");
                    System.out.println("1. Impreso");
                    System.out.println("2. Digital");
                    int tipoLibro = teclado.nextInt();

                    if (tipoLibro == 1) {
                        listaLibrosImpresos.forEach(Libro::mostrarInfo);
                    } else if (tipoLibro == 2) {
                        listaLibrosDigitales.forEach(Libro::mostrarInfo);
                    }

                }
                case 3 -> {
                    System.out.println("Saliendo...");
                    estado = false;
                }

            }
        } while (estado);

    }
}