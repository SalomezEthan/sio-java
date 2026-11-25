package fr.sio.tp03;

import java.util.Scanner;

public class Fiche1 {
    private static Scanner sc = new Scanner(System.in);
    
    public static void exo1() {
        for (int i = 0; i <= 20; ++i) {
            System.out.println(i);
        }
    }

    public static void exo2() {
        for (int i = 10; i >= 0; --i) {
            System.out.print(i);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }

    public static void exo3() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entrez un nombre :");
            int nombre = sc.nextInt();

            for (int i = 0; i < nombre; ++i) {
                for (int j = 0; j < i; ++j) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }

    public static void exo5() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d%n", i, j, i * j);
            }
            System.out.println();
        }
    }

    public static void exo6() {
        char resp;

        do {
            System.out.println("Voulez-vous continuer ? (O : oui / N : non)");
            resp = sc.next().charAt(0);
        }
        while (resp == 'o');
    }

    public static void exo7() {
        String resp;

        do {
            System.out.println("Voulez-vous interrompre ? (O : oui / N : non)");
            resp = sc.next();
        }
        while (resp.equalsIgnoreCase("n") || resp.equalsIgnoreCase("non"));
    }

    public static void exo8() {
        double count = 0;
        double sum = 0;
        double entry = 0;
        
        while (true) {
            System.out.println("Entre une note (-1 pour calculer la moyenne) :");
            entry = sc.nextDouble();

            if (entry != -1) {
                break;
            }

            sum += entry;
                ++count;
        }

        if (count == 0) {
            return;
        }

        double moyenne = sum / count;
        System.out.printf("La moyenne est de %f%n", moyenne);
    }

    public static void exo9() {
        while (true) {
            System.out.println("Séléctionner une opération (+, -, * ou /) :");
            char operator = sc.next().charAt(0);
            
            if (operator == 'q') {
                break;
            }

            System.out.println("Entrez le nombre A");
            double numA = sc.nextDouble();

            System.out.println("Entrez le nombre B");
            double numB = sc.nextDouble();

            double result;
            switch (operator) {
                case '+' :
                    result = numA + numB;
                    break;
                case '-' :
                    result = numA - numB;
                    break;
                case '*' :
                    result = numA * numB;
                    break;
                case '/' :
                    result = numA / numB;
                    break;
                default :
                    System.out.println("Opérateur inconnu, relancement du programme...");
                    continue;
            }

            System.out.printf("%f %s %f = %f%n", numA, operator, numB, result);
        }
    }
}
