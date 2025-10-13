package algoritmos;

import java.util.Scanner;

public class SucessorAntecessor {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.println("=====Antecessor & Sucessor=====");
        int n;
        int sucessor = 0;
        int antecessor = 0;
        System.out.println("Digite um número: ");
        n = input.nextInt();

        antecessor = n -1;
        sucessor = n + 1;
        System.out.println("O antecessor do número " + n + "  é : " + antecessor);
        System.out.println("O sucessor do número " +  n + "  é : " + sucessor);



    }
}
