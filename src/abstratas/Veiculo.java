package abstratas;

public abstract class Veiculo {
    private String marca;
    private int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("O veículo da marca " + marca + " (Ano: " + ano + ") está ligado.");
    }

    public abstract void buzinar();

    public String getMarca() { return marca; }
    public int getAno() { return ano; }
}