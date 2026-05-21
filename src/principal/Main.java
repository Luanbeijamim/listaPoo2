package principal;

// Importações do pacote heranca
import heranca.Aluno;
import heranca.Professor;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Gabriel", 20, "2026001F");

        Professor professor = new Professor("Diego Alves", 35, "Programação Orientada a Objetos");

        aluno.apresentar();

        professor.apresentar();

        /*

        Tanto 'aluno' quanto 'professor' conseguem chamar o método apresentar()
        porque ambos SÃO uma extensão de Pessoa. O código do método foi escrito
        uma única vez na classe pai e reaproveitado integralmente pelas classes filhas,
        evitando a duplicação de lógica no projeto.
         */
    }
}