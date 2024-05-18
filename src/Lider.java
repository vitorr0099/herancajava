public class Lider extends Funcionario {
    // Construtor
    public Lider(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    // Método para calcular o salário com bonificação para líderes
    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.02; // Incremento de 2%
    }
}