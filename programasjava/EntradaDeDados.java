package programasjava;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("\nDigite sua nota: ");
        float nota = teclado.nextFloat();

        System.out.printf("\nA nota de %s é %.1f.", nome, nota);
    }
    
}
