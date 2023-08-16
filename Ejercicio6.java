import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		final double IVA = 0.21;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el precio del producto: ");
		
        double precioProducto = scanner.nextDouble();
        double precioFinalConIVA = precioProducto * (1 + IVA);
        
        System.out.println("El precio final con IVA es: " + precioFinalConIVA);
        scanner.close();

	}

}
