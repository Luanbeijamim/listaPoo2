package wrappers;

public class Exercicio03 {
    public void executar() {
        /* O Java utiliza o Integer Cache para otimizar a memória em valores
           comuns. Objetos entre -128 e 127 compartilham a mesma referência. */
        Integer num1 = 127;
        Integer num2 = 127;

        System.out.println("=== Teste com 127 ===");
        System.out.println("num1 == num2 ? " + (num1 == num2)); // Compara referências; resulta em true pelo cache.

        /* Valores fora do intervalo de cache (como 200) resultam na criação
            de novas instâncias, ocupando endereços de memória distintos. */
        Integer num3 = 200;
        Integer num4 = 200;

        System.out.println("=== Teste com 200 ===");
        System.out.println("num3 == num4 ? " + (num3 == num4)); // Resulta em false pois as referências são distintas.
        System.out.println("num3.equals(num4) ? " + num3.equals(num4)); // Compara o conteúdo lógico; resulta em true.

        explicarConceito();
    }

    private void explicarConceito() {
        /* O método equals() é a forma segura de comparar a igualdade de valor
           em classes Wrapper, evitando falhas por limites de cache. */
        System.out.println("O operador '==' verifica se os objetos apontam para o mesmo local na memória.");
        System.out.println("O 'Integer Cache' faz com que valores até 127 usem o mesmo endereço.");
        System.out.println("Acima de 127, novos endereços são gerados, exigindo o uso de .equals().");
    }
}
