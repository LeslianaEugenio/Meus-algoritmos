package algoritmos;

public class Media {
    static void main(String[] args) {
        System.out.println("====Média dos números====");
        int n1 = 8;
        int n2 = 9;
        int n3 = 7;
        int media = 0;
        int mediaDasMedias = 0;
        int somaDasMedias = 0;
        int n4 = 4;
        int n5 = 5;
        int n6 = 6;
        int media2 = 0;

        media = (n1+n2+n3) /2;
        media2 = (n4+n5+n6) /2;

        somaDasMedias = media2 + media;
        mediaDasMedias = media + media2 /2;
        System.out.println("Media dos números 4, 5, 6   : " + media2);
        System.out.println("Media dos números 7, 8, 9   : " + media);
        System.out.println("Media das medias: " + mediaDasMedias);
        System.out.println("Soma das medias: " + somaDasMedias);




    }
}
