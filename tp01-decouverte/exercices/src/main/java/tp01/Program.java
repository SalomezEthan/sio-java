package tp01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        exo2();
    }

    public static void exo1() {
        System.out.println("hello world");
    }

    public static void exo2() {
        double prix1 = 11.5;
        double prix2 = 8.7;
        double prix3 = 4;
        double somme = prix1 + prix2 + prix3;
        System.out.println(somme);
    }

    public static void exo3() {
        double nombre = 3.14;
        System.out.println(nombre);

        /*
        int entier = nombre; // Ligne provoquant une erreur
        System.out.println(entier);
        */
    }

    public static void exo4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez votre nom :");
        String nom = sc.next();

        System.out.println("Entrez votre prénom :");
        String prenom = sc.next();

        System.out.println("Bonjour " + nom + " " + prenom);
    }

    public static void exo5() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez un nombre entier :");
        int nombreInt = sc.nextInt();
        System.out.println("Vous avez saisi l'entier : " + nombreInt);

        System.out.println("Saisissez un nombre float :");
        float nombreFloat = sc.nextFloat();
        System.out.println("Vous avez saisi le float : " + nombreFloat);

        System.out.println("Saisissez un nombre double :");
        double nombreDouble = sc.nextDouble();
        System.out.println("Vous avez saisi le double : " + nombreDouble);
    }

    public static void exo6() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez un nombre sous forme de texte :");
        String saisie = sc.next();
        int nombre = Integer.parseInt(saisie);
        System.out.println("Nombre converti en int : " + nombre);

        System.out.println("Saisissez un nombre réel sous forme de texte :");
        saisie = sc.next();
        float reel = Float.parseFloat(saisie);
        System.out.println("Nombre converti en float : " + reel);
    }

    public static void exo7() {
        final double NOMBRE_DE_NOTES = 3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez les 3 notes");
        double noteA = sc.nextDouble();
        double noteB = sc.nextDouble();
        double noteC = sc.nextDouble();
        double moyenne = (noteA + noteB + noteC) / NOMBRE_DE_NOTES;

        System.out.println("La moyenne est : " + moyenne);
    }

    public static void exo8() {
        final int ANNEE_ACTUELLE = 2026;

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer votre année de naissance :");
        int anneeNaissanceUtilisateur = sc.nextInt();

        int ageUtilisateur = ANNEE_ACTUELLE - anneeNaissanceUtilisateur;
        System.out.println("Vous avez ou aurez " + ageUtilisateur + " ans cette année");
    }
}
