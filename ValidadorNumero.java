package tareasdia18;

import java.util.Scanner;

public class ValidadorNumero {
	private int numero;

    public ValidadorNumero(int numero) {
        this.numero = numero;
    }

    public void validar() {
        if (numero >= 0 && numero <= 5) {
            System.out.println("El número ingresado no cumple con los requisitos.");
            System.out.println("Vuelva a intentarlo.");
            int nuevoNumero = tarea1.solicitarNumero();
            this.numero = nuevoNumero;
            validar();
        }
    }
}


