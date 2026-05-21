package abstratas;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, int ano, int numPortas) {
        super(marca, ano); // Chama o construtor da classe pai (Veiculo)
        this.numPortas = numPortas;
    }

    @Override
    public void buzinar() {
        System.out.println("[CARRO] Beep Beep! (Buzina de carro de " + numPortas + " portas)");
    }
}