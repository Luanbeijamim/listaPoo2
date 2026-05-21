package heranca;

public class Veiculo {
    /* O uso de modificadores privados restringe o acesso direto aos dados,
       obrigando o uso de métodos públicos para manipulação (Encapsulamento). */
    private String marca;
    private int ano;

    // Define o estado inicial do objeto no momento da instância.
    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    /* Método comum que será compartilhado com todas as classes filhas
       através do mecanismo de herança. */
    public void ligar() {
        System.out.println("O veículo da marca " + marca + " (Ano: " + ano + ") está ligado!");
    }

    // Métodos de acesso para leitura de atributos privados.
    public String getMarca() {
        return marca; // Retorna a marca do veículo.
    }

    public int getAno() {
        return ano; // Retorna o ano do veículo.
    }
}
