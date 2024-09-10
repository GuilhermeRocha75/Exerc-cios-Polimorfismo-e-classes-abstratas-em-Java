/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Joao", 5000, 2000);
        Funcionario programador = new Programador("Julia", 4000, 800);

        System.out.println("Salário do Gerente " + gerente.getNome() + ": " + gerente.calcularSalario());
        System.out.println("Salário do Programador " + programador.getNome() + ": " + programador.calcularSalario());
    }
}
