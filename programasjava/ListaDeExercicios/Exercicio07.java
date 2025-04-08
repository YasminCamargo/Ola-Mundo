package programasjava.ListaDeExercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int maior = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um número: ");
            int numero = teclado.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
    }
}
