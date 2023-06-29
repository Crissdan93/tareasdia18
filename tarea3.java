package tareasdia18;

import java.util.Scanner;

public class tarea3 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        int factorial = 1;
        int contador = 1;

        do {
        	factorial = factorial * contador;
            contador++; 
        } while (contador <= numero);

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
	
	
	


