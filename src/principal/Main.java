package principal;

import abstratas.Carro;
import abstratas.Moto;
import abstratas.Veiculo;

public class Main {

    public static void main(String[] args) {

        Carro meuCarro = new Carro("Toyota", 2024, 4);
        Moto minhaMoto = new Moto("Honda", 2025);

        meuCarro.ligar();
        meuCarro.buzinar();

        minhaMoto.ligar();
        minhaMoto.buzinar();

        /*Se você remover as duas barras "//" da linha abaixo para testar:
        Veiculo v = new Veiculo("Genérico", 2026);
        O IntelliJ vai dar o erro: 'Veiculo' is abstract; cannot be instantiated*/
    }
}