package programasjava.CalculadoraExercicioAula;

class Multiplicacao extends Operacao {
    public Multiplicacao() {}

    @Override
    public double calcula() {
        return valor1 * valor2;
    }
}
