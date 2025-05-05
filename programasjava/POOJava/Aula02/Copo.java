package programasjava.POOJava.Aula02;

public class Copo {
    String material;
    int mililitros;
    String cor;
    boolean limpo;

    void limpar() {
        if (this.limpo == false) {
            System.out.println("Limpando....");
            System.out.println("Pronto! Copo limpo com sucesso.");
            this.limpo = true;
        } else {
            System.out.println("ERRO! O copo já está limpo.");
        }
    }

    void sujar() {
        this.limpo = false;
    }

    void encher() {
        this.mililitros = 500;
    }

    void beber() {
        if (this.mililitros != 0) {
            System.out.println("Estou bebendo....~");
            System.out.println("Bebi um gole!");
            this.mililitros -= 100;
        } else {
            System.out.println("Opa! O copo está vazio.");
        }
    }

    void statusCopo() {
        System.out.println("Mililitros: " + this.mililitros);
    }
}
