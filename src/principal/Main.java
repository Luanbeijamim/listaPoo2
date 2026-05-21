package principal;

import java.util.ArrayList;
import java.util.List;

import polimorfismo.Animal;
import polimorfismo.Cachorro;
import polimorfismo.Gato;

public class Main {

    public static void main(String[] args) {

        /* Uso do Generics (<Animal>) para restringir a coleção a objetos da superclasse
           ou de suas subclasses, aplicando a abstração via interface List. */
        List<Animal> listaAnimais = new ArrayList<>();

        listaAnimais.add(new Cachorro("Rex"));
        listaAnimais.add(new Gato("Mimi"));
        listaAnimais.add(new Cachorro("Thor"));
        listaAnimais.add(new Gato("Garfield"));

        System.out.println("--- Percorrendo a Lista com For-Each ---");

        /* O laço itera de forma agnóstica; a JVM resolve o método adequado de
           cada instância contida na lista em tempo de execução. */
        for (Animal animal : listaAnimais) {
            animal.emitirSom(); // Execução polimórfica baseada no objeto atual da iteração.
        }

        /* Estruturas baseadas em polimorfismo respeitam o princípio Aberto/Fechado (OCP):
           novos subtipos podem ser adicionados sem alterar o código de processamento existente. */
    }
}