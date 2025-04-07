package programasjava.ListaDeExercicios;

import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = teclado.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double n3 = teclado.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.printf("A média das notas é: %.1f", media);
    }
}
