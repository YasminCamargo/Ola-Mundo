package programasjava;

public class ConverterTiposDeDados {
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

        String nota = "8.5";
        float nt = Float.parseFloat(nota);
        System.out.println(nt);
        //String(texto) para float(real).

        //usa método da classe Float.
    }
}
