package programasjava.ListaDeExercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        float n1 = teclado.nextFloat();

        if (n1 != 0) {
            if (n1 > 0) {
                System.out.println("O valor digitado é POSITIVO!");
            }
           else {
                System.out.println("O valor digitado é NEGATIVO!");
            }
        }
        else {
            System.out.println("O valor digitado é NULO!");
        }
    }
}
