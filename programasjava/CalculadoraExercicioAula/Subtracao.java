package programasjava.CalculadoraExercicioAula;

class Subtracao extends Operacao {
    public Subtracao() {}

    @Override
    public double calcula() {
        return valor1 - valor2;
    }
}
