package algoritmos;

import java.util.Scanner;

public class ClienteBAI {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("======Cliente BAI=======");

        double saldoAtual = 10.00000;
        double valorRecebido;
        double saldoAtualizado = 0;

        System.out.println("Digite o valor do cheque recebido (use virgula EM VEZ DE PONTO): ");
        valorRecebido = input.nextDouble();

        saldoAtualizado = saldoAtual + valorRecebido;

        System.out.println("Seu saldo atualizado da sua conta BAI é: " + saldoAtualizado + " mil kz");





    }
}
