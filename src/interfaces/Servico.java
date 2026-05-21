package interfaces;

public class Servico implements Tributavel {
    private double valor;

    public Servico(double valor) {
        this.valor = valor;
    }

    /*Conforme a lista, o serviço tributa 6%sobre o seu valor total (valor * 0.06).*/
    @Override
    public double calcularImposto() {
        return this.valor * 0.06;
    }

    public double getValor() {
        return valor;
    }
}