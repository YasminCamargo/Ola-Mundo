package programasjava.ListaDeExercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = teclado.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("O número " + n1 + " é PAR!");
        }
        else {
            System.out.println("O número " + n1 + " é ÍMPAR!");
        }
    }
}
