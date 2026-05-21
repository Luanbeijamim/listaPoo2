package principal;

import java.util.ArrayList;
import java.util.List;

import abstratas.Forma;
import abstratas.Circulo;
import abstratas.Retangulo;

public class Main {

    public static void main(String[] args) {

        /* Agrupamento de diferentes implementações sob o tipo da superclasse
           abstrata utilizando uma coleção parametrizada. */
        List<Forma> listaFormas = new ArrayList<>();

        // Adição de instâncias concretas à lista polimórfica.
        listaFormas.add(new Circulo(2.5));
        listaFormas.add(new Retangulo(4.0, 5.0));
        listaFormas.add(new Circulo(5.0));

        System.out.println("--- Calculando Áreas Polimorficamente ---");

        /* A iteração utiliza a referência abstrata para invocar o comportamento
           sobrescrito em cada classe filha (Dynamic Binding). */
        for (Forma forma : listaFormas) {
            // O cálculo executado é estritamente o da figura correspondente à instância.
            System.out.println("Área da forma: " + forma.calcularArea());
        }
    }
}