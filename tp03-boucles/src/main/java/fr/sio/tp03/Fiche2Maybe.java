package fr.sio.tp03;

import java.util.ArrayList;
import java.util.Scanner;

public class Fiche2Maybe {
    private static Scanner sc = new Scanner(System.in);

    public static void exo1() {
        // exo2
        System.out.println("Entrez le nombre de jours utilisés pour faire la moyenne :");
        int dayNumber = sc.nextInt();
        //

        int sum = 0;
        for (int day = 1; day <= dayNumber; ++day) {
            System.out.printf("Indiquez la température du jour %d pour faire la moyenne : %n", day);
            sum += sc.nextInt();
        }

        int average = sum / dayNumber;
        System.out.printf("La température moyenne est %d°c%n", average);
    }

    public static void exo3() {
        final int MAX_MOUNTH_DAY_NUMBER = 30;

        String[] mounths = {
            "Janvier", 
            "Février", 
            "Mars", 
            "Avril", 
            "Mai", 
            "Juin", 
            "Juillet", 
            "Aout", 
            "Septembre", 
            "Octobre", 
            "Novembre", 
            "Décembre"
        };

        String[] days = {
            "Lundi",
            "Mardi",
            "Mercredi",
            "Jeudi",
            "Vendredi",
            "Samedi",
            "Dimanche"
        };

        int actualDayIndex = 0;

        for (String mounth : mounths) {
            System.out.println(mounth);
            System.out.println("-----------------");

            for (int mounthDayNumber = 1; mounthDayNumber <= MAX_MOUNTH_DAY_NUMBER; ++mounthDayNumber) {
                System.out.printf("%s : %d%n", days[actualDayIndex], mounthDayNumber);
                actualDayIndex = (actualDayIndex + 1 + days.length) % days.length;
            }

            System.out.println();
            System.out.println();
        }
    }

    public static void exo4() {
        int pageNumber = 10;
        int pageNumberSum = 0;

        while (pageNumberSum != 2025) {
            ++pageNumber;
            pageNumberSum += pageNumber;
        }

        System.out.printf("Il y a %d pages%n", pageNumber);
    }

    public static void exo5() {
        ;

        while (true) {
            ArrayList<Integer> notes = new ArrayList<Integer>();
            int entry = sc.nextInt();
        }
    }
}
