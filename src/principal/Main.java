package principal;

import abstratas.Circulo;
import abstratas.Retangulo;

public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(5.0);
        Retangulo retangulo = new Retangulo(4.0, 3.0);

        System.out.println("--- Área do Círculo ---");
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Área calculada: " + circulo.calcularArea());


        System.out.println("--- Área do Retângulo ---");
        System.out.println("Dimensões: " + retangulo.getLargura() + "x" + retangulo.getAltura());
        System.out.println("Área calculada: " + retangulo.calcularArea());

        /* Classes abstratas funcionam estritamente como matrizes de herança;
           a tentativa de instanciação direta (new Forma()) gera erro de compilação. */
    }
}