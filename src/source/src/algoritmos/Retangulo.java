package algoritmos;

import java.util.Scanner;

public class Retangulo {
    static void main(String[] args) {
        System.out.println("====Área do Retângulo====");
        Scanner input = new Scanner(System.in);
        int area;
        int base;
        int altura;

        System.out.println("Digite o valor de base: ");
        base = input.nextInt();
        System.out.println("Digite o valor de altura: ");
        altura = input.nextInt();

        area = base*altura;
        System.out.println("A área do triangulo é:" + area +"cm");

    }
}
