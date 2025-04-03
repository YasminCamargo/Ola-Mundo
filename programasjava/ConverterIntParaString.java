package programasjava;

public class ConverterIntParaString {
    public static void main(String[] args) {
        int valor = 30;
        String preco = Integer.toString(valor);
        System.out.println(preco);
        //Inteiro para String(texto).

        String quantidade = "10";
        int qtd = Integer.parseInt(quantidade);
        System.out.println(qtd);
        //String(texto) para inteiro.

        //Os 2 usam métodos da classe Integer.
    }
}
