public class Main {
    public static void main(String[] args) {
        // Criando objetos dos funcionários
        Funcionario funcionario1 = new Funcionario("João", 10.0, 160);
        Lider lider1 = new Lider("Maria", 15.0, 160);
        Gerente gerente1 = new Gerente("Carlos", 20.0, 160);

        // Calculando e exibindo salários
        System.out.println("Salário de " + funcionario1.getNome() + ": " + funcionario1.calcularSalario());
        System.out.println("Salário de " + lider1.getNome() + ": " + lider1.calcularSalario());
        System.out.println("Salário de " + gerente1.getNome() + ": " + gerente1.calcularSalario());
    }
}