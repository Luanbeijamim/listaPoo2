package heranca;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome); // Repassa o nome para o construtor de Animal
    }

    /*
     A anotação @Override avisa ao compilador que estamos intencionalmente
     modificando o comportamento do método emitirSom() que veio do pai (Animal).
     Se errarmos o nome do método por sem querer, o Java gera um erro de compilação.
     */
    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": Au au!");
    }
}