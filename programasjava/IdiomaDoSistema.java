package programasjava;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args){
        Locale idioma = Locale.getDefault();
        System.out.print("O idioma do sistema é: ");
        System.out.print(idioma.toString());
    }
}
