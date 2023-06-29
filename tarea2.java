package tareasdia18;

import java.util.Scanner;

public class tarea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        
        int suma = 0;
        int digitos = numero;

        while (digitos != 0) {
            int digito = digitos % 10; 
            suma += digito; 
            digitos /= 10; 
        }

        System.out.println("La suma de los dígitos es: " + suma);
    }
}