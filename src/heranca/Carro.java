package heranca;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, int ano, int numPortas) {
        /*

         A palavra-chave 'super(...)' é usada para invocar diretamente o construtor
         da classe pai (Veiculo).
         Ela DEVE ser, obrigatoriamente, a primeira linha de código dentro do
         construtor da classe filha. Isso garante que a base do objeto seja
         construída corretamente antes de adicionarmos as particularidades do Carro.
         */
        super(marca, ano);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }
}