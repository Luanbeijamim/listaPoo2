package interfaces;

public class Produto implements Tributavel {
    private double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    /*Conforme a lista do professor Diego, produto tributa 12% sobre o seu preço (preco * 0.12).*/
    @Override
    public double calcularImposto() {
        return this.preco * 0.12;
    }

    public double getPreco() {
        return preco;
    }
}