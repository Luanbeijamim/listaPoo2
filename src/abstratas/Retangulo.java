package abstratas;

public class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura; // Fórmula: base * altura
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }
}