package heranca;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " anos");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
