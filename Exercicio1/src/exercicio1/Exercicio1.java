/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio1 {
    public static void main(String[] args) {
        FormaGeometrica circulo = new FormaGeometrica.Circulo(10.0);
        FormaGeometrica retangulo = new FormaGeometrica.Retangulo(5.0, 6.0);
        FormaGeometrica triangulo = new FormaGeometrica.Triangulo(3.0, 3.0);

        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
    }
}
