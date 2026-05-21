package wrappers;
import java.math.BigDecimal;
public class Exercicio04 {
    public void executar() {

        /* O uso de String no construtor evita que a imprecisão binária do tipo double
           seja transferida para o objeto BigDecimal durante a criação. */
        BigDecimal precoUnitario = new BigDecimal("49.90");
        BigDecimal quantidade = new BigDecimal("3");

        // Define o fator de pagamento (95%) para aplicar o desconto de 5%.
        BigDecimal fatorPagar = new BigDecimal("0.95");

        /* BigDecimal é imutável; operações como multiply() retornam uma nova
           instância com o resultado preciso do cálculo financeiro. */
        BigDecimal totalSemDesconto = precoUnitario.multiply(quantidade);
        BigDecimal totalComDesconto = totalSemDesconto.multiply(fatorPagar);

        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total com 5% de desconto: R$ " + totalComDesconto);

        /* Diferente de double ou float, o BigDecimal utiliza representação decimal
           exata, sendo indispensável para evitar erros acumulados em sistemas fiscais. */
    }
}
