package programasjava.ListaDeExercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int n1 = teclado.nextInt();

        System.out.print("Segundo número: ");
        int n2 = teclado.nextInt();

        System.out.println("-----------=");
        int soma = n1 + n2;
        System.out.printf("%d + %d = %d", n1, n2, soma);
        System.out.println("");

        System.out.println("-----------=");
        int subtracao = n1 - n2;
        System.out.printf("%d - %d = %d", n1, n2, subtracao);
        System.out.println("");

        System.out.println("-----------=");
        int multiplicacao = n1 * n2;
        System.out.printf("%d x %d = %d", n1, n2, multiplicacao);
        System.out.println("");

        System.out.println("-----------=");
        float divisao = (float) n1 / (float) n2;
        System.out.printf("%.2f / %.2f = %.2f", n1, n2, divisao);
    }
}
