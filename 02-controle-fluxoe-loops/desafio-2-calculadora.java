import java.util.Scanner;

public class CalculadoraDescontos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor da compra: R$ ");
        double valorCompra = entrada.nextDouble();

        System.out.println("Valor registrado com sucesso: R$ " + valorCompra);

        entrada.close();
    }
}

import java.util.Scanner;

public class CalculadoraDescontos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = entrada.nextDouble();

        System.out.println("Selecione a forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro/PIX (10% de desconto)");
        System.out.println("2 - À Vista no Cartão de Crédito (5% de desconto)");
        System.out.println("3 - 2x no Cartão (Sem juros)");
        System.out.println("4 - 3x ou mais no Cartão (10% de juros)");
        System.out.print("Opção: ");
        int opcaoPagamento = entrada.nextInt();

        System.out.println("Opção escolhida: " + opcaoPagamento);

        entrada.close();
    }
}