/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author aluno.saolucas
 */
public abstract class Pagamento {
    protected double valorBase;

    public Pagamento(double valorBase) {
        this.valorBase = valorBase;
    }

    public abstract double calcularValor();
}
