package programasjava.CalculadoraExercicioAula;

class Fatorial extends Operacao {
    public Fatorial() {}

    @Override
    public double calcula() {
        double fatorial = 1;
        for(int i = 1; i <= valor1; i++) {
            fatorial *= i ;
        }

        return fatorial;
    }
}
