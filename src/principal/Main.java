package principal;

import heranca.Cachorro;
import heranca.Gato;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Mimi");

        cachorro.emitirSom(); // Deve imprimir "Rex: Au au!"
        gato.emitirSom();     // Deve imprimir "Mimi: Miau!"
    }
}