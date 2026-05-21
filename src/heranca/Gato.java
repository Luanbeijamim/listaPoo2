package heranca;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome); // Repassa o nome para o construtor de Animal
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": Miau!");
    }
}