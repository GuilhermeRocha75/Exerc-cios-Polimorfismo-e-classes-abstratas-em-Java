/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author aluno.saolucas
 */
public class ContaCorrente extends ContaBancaria {
    private double taxaDeOperacao = 0.5;

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor + taxaDeOperacao) {
            saldo -= (valor + taxaDeOperacao);
            System.out.println("Saque de " + valor + " realizado com sucesso. Taxa: " + taxaDeOperacao);
        } else {
            System.out.println("Saldo insuficiente para saque na Conta Corrente.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor - taxaDeOperacao;
        System.out.println("Depósito de " + valor + " realizado com sucesso. Taxa: " + taxaDeOperacao);
    }
}

