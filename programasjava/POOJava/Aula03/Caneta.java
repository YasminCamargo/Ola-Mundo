package programasjava.POOJava.Aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Essa caneta é: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Essa caneta está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando....");
        }
    }

    protected void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false; //Consigo alterar o tampada, que é private, aqui na classe.
    }
    
}
