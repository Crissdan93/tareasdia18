package tareasdia18;

import java.util.Scanner;

	public class tarea1 {
	    public static void main(String[] args) {
	        int numero = solicitarNumero();
	        ValidadorNumero validador = new ValidadorNumero(numero);
	        validador.validar();
	        System.out.println("¡Número válido ingresado!");
	    }

	    public static int solicitarNumero() {
	        Scanner scanner = new Scanner(System.in);
	        int numero;

	        do {
	            System.out.println("Ingrese un número negativo mayor a 5:");
	            numero = scanner.nextInt();
	        } while (numero >= 0 || numero <= 5);

	        return numero;
	    }
	}



