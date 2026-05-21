package heranca;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    /* A anotação @Override sinaliza que o método original da superclasse foi
       substituído por uma implementação específica para esta subclasse. */
    @Override
    public double calcularBonus() {
        // Métodos assessores (getters) são necessários devido ao encapsulamento da classe pai.
        return getSalario() * 0.20;
    }
}