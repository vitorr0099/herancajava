public class Gerente extends Funcionario {
    // Construtor
    public Gerente(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    // Método para calcular o salário com bonificação para gerentes
    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.05; // Incremento de 5%
    }
}