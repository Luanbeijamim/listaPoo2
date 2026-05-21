package heranca;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade); // Passa os dados obrigatórios para o construtor de Pessoa
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
}