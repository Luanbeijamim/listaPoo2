package principal;

import heranca.Carro;

public class Main {

    public static void main(String[] args) {

        // Criando um objeto do tipo Carro
        Carro meuCarro = new Carro("Toyota", 2024, 4);

        // Chamando o método ligar() que foi herdado de Veiculo
        meuCarro.ligar();

        System.out.println("Número de portas do carro: " + meuCarro.getNumPortas());
    }
}