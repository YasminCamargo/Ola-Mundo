package programasjava;

public class FormatacaoNoPrint {
    public static void main(String[] args) {
        float nota = (float) 9.5;
        String nome = (String) "Yasmin";

        System.out.printf("A nota de %s é %.2f.\n", nome, nota);
    //Poderia ser também System.out.format("A nota de %s é %.2f.\n", nome, nota);
    }
}
