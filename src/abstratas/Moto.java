package abstratas;

public class Moto extends Veiculo {

    public Moto(String marca, int ano) {
        super(marca, ano);
    }

    @Override
    public void buzinar() {
        System.out.println("[MOTO] Bibi! (Buzina aguda de moto)");
    }
}