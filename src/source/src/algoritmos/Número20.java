package algoritmos;

import java.util.Scanner;

public class Número20 {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.println("DIgite um número: ");
        n = ler.nextInt();
        if(n > 20){
            System.out.println("O número é maior que 20");
        } else if (n == 20) {
            System.out.println("O número é igual a 20");

        }
        else{
            System.out.println("O número é menor que 20");
        }
    }
}
