package es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Inserisci il numero di parole da inserire: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            if (n <= 0) {
                System.out.println("Il numero di parole deve essere maggiore di zero.");

            }

            Set<String> parole = new HashSet<>();
            Set<String> paroleDuplicate = new HashSet<>();


            for (int i = 0; i < n; i++) {
                System.out.print("Inserisci la parola " + (i + 1) + ": ");
                String parola = scanner.nextLine();


                if (parole.contains(parola)) {

                    paroleDuplicate.add(parola);
                } else {
                   
                    parole.add(parola);
                }
            }


            System.out.println("Parole duplicate:");
            if (paroleDuplicate.isEmpty()) {
                System.out.println("Nessuna parola duplicata.");
            } else {
                for (String parola : paroleDuplicate) {
                    System.out.println(parola);
                }
            }


            System.out.println("Numero di parole distinte: " + parole.size());


            System.out.println("Elenco delle parole distinte:");
            for (String parola : parole) {
                System.out.println(parola);
            }


        } catch (Exception e) {
            System.out.println("Si è verificato un errore imprevisto: " + e.getMessage());
        }
    }
}

