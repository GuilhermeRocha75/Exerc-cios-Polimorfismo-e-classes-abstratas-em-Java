package exercicio5;

public class Programador extends Funcionario {
    private double adicional;

    public Programador(String nome, double salarioBase, double adicional) {
        super(nome, salarioBase);
        this.adicional = adicional;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + adicional;
    }
}
