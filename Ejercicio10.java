import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de ventas: ");
        int numeroVentas = scanner.nextInt();

        double sumaVentas = 0;

        for (int i = 1; i <= numeroVentas; i++) {
            System.out.print("Ingrese la venta " + i + ": ");
            double venta = scanner.nextDouble();
            sumaVentas += venta;
        }

        System.out.println("La suma de todas las ventas es: " + sumaVentas);
        scanner.close();
    }
}
