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
public class PagamentoBoleto extends Pagamento {
    private double desconto = 0.10; // 10%

    public PagamentoBoleto(double valorBase) {
        super(valorBase);
    }

    @Override
    public double calcularValor() {
        return valorBase - (valorBase * desconto);
    }
}

