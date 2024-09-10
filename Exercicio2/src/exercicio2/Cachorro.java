/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author aluno.saolucas
 */
public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz: Au Au");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro está correndo.");
    }
}

