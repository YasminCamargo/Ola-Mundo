package programasjava.ListaDeExercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digiteo seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Agora digite a sua idade: ");
        int idade = teclado.nextInt();

        if (idade >= 18) {
            System.out.println("Parabéns, " + nome + "! Você já é maior de idade.");
        }
        else {
            System.out.printf("Olá, %s! Você ainda é menor de idade.", nome);
        }
    }
}
