package algoritmos;

public class ViceVersa {
    static void main(String[] args) {
        System.out.println("==Algoritmo passagem de valores de variáveis==");
        int x = 2;
        int y = 3;
        int reserva = 0;
        System.out.println("Valor da variável X: " + x);
        System.out.println("Valor da variável y: " + y);
        System.out.println();

        System.out.println("Fazendo a passagem de valores das variáveis: ");
        reserva = x;
        x = y;
        y = reserva;

        System.out.println("Valor de X : " + x);
        System.out.println("Valor de Y : " + y);
    }

}
