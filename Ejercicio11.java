import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un día de la semana (en minúsculas): ");
        String diaSemana = scanner.nextLine();

        switch (diaSemana) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println(diaSemana + " es un día laboral.");
                break;
            case "sábado":
            case "sabado":
            case "domingo":
                System.out.println(diaSemana + " no es un día laboral.");
                break;
            default:
                System.out.println("Día no válido.");
        }

        scanner.close();
    }
}
