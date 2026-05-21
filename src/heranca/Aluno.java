package heranca;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade); // Passa os dados obrigatórios para o construtor de Pessoa
        this.matricula = matricula;
    }

    /*Opcional: Sobrescrever para incluir a matrícula na apresentação.
     Como o exercício pede apenas para herdar e chamar o apresentar(),
     manteremos o método base, mas você pode usar o getMatricula() se quiser.
     */
    public String getMatricula() {
        return matricula;
    }
}