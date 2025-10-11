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



double valorFinal = valorCompra;
String descricaoPagamento = "";

switch (opcaoPagamento) {
    case 1:
        valorFinal = valorCompra * 0.90;
        descricaoPagamento = "À Vista em Dinheiro/PIX";
        break;
    case 2:
        valorFinal = valorCompra * 0.95;
        descricaoPagamento = "À Vista no Cartão de Crédito";
        break;
    case 3:
        valorFinal = valorCompra;
        descricaoPagamento = "2x no Cartão (Sem juros)";
        break;
    case 4:
        valorFinal = valorCompra * 1.10;
        descricaoPagamento = "3x ou mais no Cartão (10% de juros)";
        break;
    default:
        System.out.println("Opção inválida!");
        entrada.close();
        return;
}

System.out.printf("Valor final calculado: R$ %.2f%n", valorFinal);

int parcelas = 0;

if (opcaoPagamento == 4) {
    do {
        System.out.print("Digite a quantidade de parcelas (3 a 10): ");
        parcelas = entrada.nextInt();
        if (parcelas < 3 || parcelas > 10) {
            System.out.println("Quantidade inválida! Tente novamente.");
        }
    } while (parcelas < 3 || parcelas > 10); 
    //Anotação Para estudo pessoal o || serve para verificar se o usuario digitou um número dentro do intervalo válido estabelecido (3a10) é uma condição.
}