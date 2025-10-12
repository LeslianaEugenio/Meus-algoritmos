package algoritmos;

import java.util.Scanner;

public class VendasSoftware {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====Vendas de Software=====");
        double salario = 75.000;
        double valorDeVendas;
        System.out.println("Digite o valor de vendas de software no mês: ");
        valorDeVendas = input.nextDouble();

        valorDeVendas = (valorDeVendas * 15)/100;
        double salarioTotal = valorDeVendas + salario;

        System.out.println("15% do seu valor de vendas: " + valorDeVendas);
        System.out.printf(" O seu salario total com a comissão de 15%% pelo valor de vendas é: %.3f",
                salarioTotal, "Mil kwanzas");

    }
}
