import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer operando: ");
        int operando1 = scanner.nextInt();
        System.out.print("Ingrese el segundo operando: ");
        int operando2 = scanner.nextInt();

        System.out.print("Ingrese el signo aritmético (+, -, *, /, ^, %): ");
        scanner.nextLine();
        String operador = scanner.nextLine();

        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                resultado = (double) operando1 / operando2;
                break;
            case "^":
                resultado = Math.pow(operando1, operando2);
                break;
            case "%":
                resultado = operando1 % operando2;
                break;
            default:
                System.out.println("Operador no válido.");
                break;
        }

        if (!operador.equals("")) {
            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();
    }

}
