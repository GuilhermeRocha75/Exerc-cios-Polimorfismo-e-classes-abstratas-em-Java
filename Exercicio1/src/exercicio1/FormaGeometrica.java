package exercicio1;

public abstract class FormaGeometrica {

    // Método abstrato para cálculo da área
    public abstract double calcularArea();

    // Classe concreta para Circulo
    public static class Circulo extends FormaGeometrica {
        private double raio;

        public Circulo(double raio) {
            this.raio = raio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * Math.pow(raio, 2);
        }
    }

    // Classe concreta para Retangulo
    public static class Retangulo extends FormaGeometrica {
        private double largura;
        private double altura;

        public Retangulo(double largura, double altura) {
            this.largura = largura;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return largura * altura;
        }
    }

    // Classe concreta para Triangulo
    public static class Triangulo extends FormaGeometrica {
        private double base;
        private double altura;

        public Triangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return (base * altura) / 2;
        }
    }
}
