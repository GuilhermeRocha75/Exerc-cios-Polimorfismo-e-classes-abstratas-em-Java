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
public class Exercicio3 {
    public static void main(String[] args) {
        // Criação das instâncias de contas bancárias
        ContaBancaria contaCorrente = new ContaCorrente(1000);
        ContaBancaria contaPoupanca = new ContaPoupanca(500);

        // Operações na Conta Corrente
        System.out.println("Extrato Conta Corrente:");
        contaCorrente.depositar(500);
        contaCorrente.sacar(100);
        System.out.println("Saldo atual da Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println();

        // Operações na Conta Poupança
        System.out.println("Extrato Conta Poupança:");
        contaPoupanca.depositar(150);
        contaPoupanca.sacar(100);
        System.out.println("Saldo atual da Conta Poupança: " + contaPoupanca.getSaldo());
    }
}

   
