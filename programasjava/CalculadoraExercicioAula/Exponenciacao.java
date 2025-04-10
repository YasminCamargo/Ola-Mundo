package programasjava.CalculadoraExercicioAula;

class Exponenciacao extends Operacao {
    public Exponenciacao() {}

    @Override
    public double calcula() {
        double base = valor1;
        double expoente = valor2;
        double exponenciacao = Math.pow(base, expoente);

        return exponenciacao;
    }
}
