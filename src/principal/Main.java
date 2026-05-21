package principal;

import interfaces.Barco;
import interfaces.Peixe;

public class Main {

    public static void main(String[] args) {

        Barco meuBarco = new Barco();
        Peixe meuPeixe = new Peixe();

        System.out.println("--- Testando a Interface Navegavel ---");
        meuBarco.navegar(); // Executa o comportamento mecânico de navegação.
        meuPeixe.navegar(); // Executa o comportamento biológico de navegação.

        /* Interfaces agrupam classes sem parentesco biológico ou estrutural,
           estabelecendo uma associação baseada exclusivamente em capacidades comuns. */
    }
}