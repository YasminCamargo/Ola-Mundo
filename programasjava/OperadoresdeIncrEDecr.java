package programasjava;

public class OperadoresdeIncrEDecr {
    public static void main(String[] args) {
        int n1 = 5;
        int somando = 5 + n1++;
        System.out.println(somando);
        System.out.println(n1);

        int n2 = 5;
        int somando2 = 5 + --n2;
        System.out.println(somando2);
        System.out.println(n2);
    }
}
