package wrappers;

public class Exercicio02 {

    public void executar() {
        Integer x = null;

        System.out.println("Tentando atribuir 'Integer x = null' a um 'int' primitivo...");

        try {
            int primitivo = x;

            System.out.println("Valor atribuído: " + primitivo);

        } catch (NullPointerException e) {
            System.out.println("[ERRO DETECTADO] Ocorreu uma: " + e.getClass().getName());
            System.out.println("Ao rodar, o programa lança um NullPointerException.");
            System.out.println("O Java tenta fazer o 'unboxing' automaticamente, o que significa");
            System.out.println("que ele tenta chamar o método 'x.intValue()' por debaixo dos panos.");
            System.out.println("Como 'x' é null, não é possível extrair um valor numérico dele.");
            System.out.println("Além disso, tipos primitivos (como int, double, boolean) guardam");
            System.out.println("valores diretos na memória e NÃO aceitam a representação de 'null'.");
        }
    }
}