package algoritmos;

import java.util.Scanner;

public class FabricaTshirts {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====Fábrica de T'sherts=====");
        int qtPequenas;
        int qtGrandes;
        int qtMedias;
        int valorCompra = 0;

        System.out.println("Digite a quantidade de t'shirts pequenas: ");
        qtPequenas = input.nextInt();
        System.out.println("Digite a quantidade de t'shirts grandes: ");
        qtGrandes = input.nextInt();
        System.out.println("Digite a quantidade de t'shirts medias: ");
        qtMedias = input.nextInt();

        valorCompra = (qtPequenas * 5) + (qtGrandes * 15) + (qtMedias * 10);

        System.out.println("Valor da compra a pagar: " + valorCompra + " mil kz");





    }
}
