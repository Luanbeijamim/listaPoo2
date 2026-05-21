package principal;

import heranca.Funcionario;
import heranca.Gerente;

public class Main {

    public static void main(String[] args) {

        Funcionario func = new Funcionario("João Silva", 3000.0);
        Gerente ger = new Gerente("Ana Costa", 8000.0);

        System.out.println("Nome: " + func.getNome());
        System.out.println("Salário: R$ " + func.getSalario());
        System.out.println("Bônus (10%): R$ " + func.calcularBonus());


        System.out.println("Nome: " + ger.getNome());
        System.out.println("Salário: R$ " + ger.getSalario());
        System.out.println("Bônus Sobrescrito (20%): R$ " + ger.calcularBonus());
    }
}