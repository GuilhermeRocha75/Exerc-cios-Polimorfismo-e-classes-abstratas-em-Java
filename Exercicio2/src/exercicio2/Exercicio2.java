/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author aluno.saolucas
 */
public class Exercicio2 {
    public static void main(String[] args) {
        // Criação da lista de animais
        List<Animal> animais = new ArrayList<>();

        // Adicionando diferentes animais à lista
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Passaro());

        // Usando polimorfismo para chamar métodos emitirSom() e mover()
        for (Animal animal : animais) {
            animal.emitirSom();
            animal.mover();
            System.out.println();  // Apenas para separar a saída de cada animal
        }
    }
}