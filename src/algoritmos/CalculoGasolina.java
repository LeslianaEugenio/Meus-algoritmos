package algoritmos;

import java.util.Scanner;

public class CalculoGasolina {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====Cálculo de Gasolina=====");
        int preco;
        int valor;
        int litro = 0;

        System.out.println("Digite o preco da gasolina: " );
        preco = input.nextInt();
        System.out.println("Digite o valor a pagar: " );
        valor = input.nextInt();

        litro = valor / preco ;
        System.out.println("Tanque abastecido com " + litro + " Litros de gasolina");

    }
}
