package Es2;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        getRandomNum();


    }

    public static void getRandomNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero intero per generare x numeri random");
        int numeroRandom = scanner.nextInt();

        TreeSet<Integer> numeriCasuali = new TreeSet<>();

        for (int i = 0; i < numeroRandom; i++) {
            Random random = new Random(100);
            numeriCasuali.add(random.nextInt());

        }
        System.out.println(numeriCasuali);

    }

    public static void listaInversa(int[] array) {
        Collections.reverse(array);

    }


}
