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
public class Exercicio4 {
    public static void main(String[] args) {
       
        Pagamento pagamentoCartao = new PagamentoCartao(1000);
        Pagamento pagamentoBoleto = new PagamentoBoleto(1000);

       
        System.out.println("Valor final do pagamento com Cartão de Crédito: R$ " + pagamentoCartao.calcularValor());
        System.out.println("Valor final do pagamento com Boleto: R$ " + pagamentoBoleto.calcularValor());
    }
}

