import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        String contraseñaCorrecta = "Tarea20";

        int intentos = 3;
        boolean contraseñaAdivinada = false;

        while (intentos > 0 && !contraseñaAdivinada) {
            System.out.print("Introduce la contraseña: ");
            String contraseñaIngresada = scanner.nextLine();

            if (contraseñaIngresada.equals(contraseñaCorrecta)) {
                contraseñaAdivinada = true;
                System.out.println("Enhorabuena!\nContraseña correcta.");
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Contraseña incorrecta. Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Has agotado tus intentos. La contraseña correcta era: " + contraseñaCorrecta);
                }
            }
        }

        scanner.close();
    }

}
