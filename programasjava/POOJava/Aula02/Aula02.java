package programasjava.POOJava.Aula02;

public class Aula02 {
    public static void main(String[] args) {

//Aprendendo criar Classes e instanciar elas

    /*    Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();

        c1.rabiscar();
        c1.status();

        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();
    */ 

    Copo copo1 = new Copo();
    copo1.material = "Vidro";
    copo1.cor = "Roxo";
    copo1.limpo = true;
    
    //copo1.sujar();
    //copo1.limpar();


    //copo1.encher();
    copo1.beber();
    copo1.statusCopo();
    }
    
}
