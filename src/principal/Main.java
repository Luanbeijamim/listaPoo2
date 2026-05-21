package principal;

import interfaces.Produto;
import interfaces.Servico;

public class Main {

    public static void main(String[] args) {

        Produto notebook = new Produto(3500.0);
        Servico consultoria = new Servico(1500.0);

        System.out.println("--- Cálculo de Tributos ---");
        System.out.println("Produto (Preço: R$ " + notebook.getPreco() + ")");
        System.out.println("Imposto a pagar (12%): R$ " + notebook.calcularImposto());


        System.out.println("Serviço (Valor: R$ " + consultoria.getValor() + ")");
        System.out.println("Imposto a pagar (6%): R$ " + consultoria.calcularImposto());
    }
}