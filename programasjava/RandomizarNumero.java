package programasjava;

import java.util.Random;

public class RandomizarNumero {
    public static void main (String[] args) {
        Random numRandom = new Random();

        System.out.println("Número aleatório: " + numRandom.nextInt()); //Gera um número aleatório positivo ou negativo

        System.out.println("Número aleatório: " + numRandom.nextInt(20)); //Gera um número aleatório POSITIVO entre 0 e 19 (exclui o 20)

        System.out.println("Número aleatório: " + (numRandom.nextInt(20) + 1));
    }
}
