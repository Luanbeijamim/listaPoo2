package principal;

import polimorfismo.Animal;
import polimorfismo.Cachorro;
import polimorfismo.Gato;

public class Main {

    public static void main(String[] args) {

        /* A declaração usa a superclasse como tipo estático, enquanto a
           instanciação define o tipo dinâmico do objeto na memória. */
        Animal animal1 = new Cachorro("Rex");
        Animal animal2 = new Gato("Mimi");

        System.out.println("--- Testando Polimorfismo ---");

        animal1.emitirSom(); // Invoca a implementação contida em Cachorro.
        animal2.emitirSom(); // Invoca a implementação contida em Gato.

        /* O polimorfismo reduz o acoplamento do sistema, permitindo interagir com
           abstrações genéricas sem depender de especificações rígidas. */
    }
}