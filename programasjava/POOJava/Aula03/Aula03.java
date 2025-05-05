package programasjava.POOJava.Aula03;

public class Aula03 {
    public static void main(String[] args) {
//Aprendendo a restringir os atributos e metodos (publico, privado e protegido)

        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Vermelha";

        c1.destampar(); // O método "Destampar" está como public, entao qualquer um pode usar.
                        //"Tampada" (atributo) é privado, entao eu nao poderia alterar aqui diretamente.
                        // Mas eu consigo "Destampar" pois quem está alterando o atributo privado é a própria Classe, na aba do código da classe
        c1.status(); 
    }
}
