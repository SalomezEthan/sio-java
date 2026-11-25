package fr.sio;

import java.util.Scanner;

public class Main {
    
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Program2 prog = new Program2();
        prog.lastExo("c:/windows/assembly");
        prog.lastExo("/sio");
    }

    private static void exo1() {
        System.out.println("Ecrire 2 phrases :");
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.printf("Longueur de a : %d caractères%n", a.length());
        System.out.printf("Longueur de b : %d caractères%n", b.length());
    }

    private static void exo2Upper() {
        System.out.println("Saisissez 2 mots :");
        String firstWord = sc.nextLine();
        String secondWord = sc.nextLine();
        System.out.printf("Le premier mot en majuscule est : %s%n", firstWord.toUpperCase());
        System.out.printf("Le second mot en majuscule est : %s%n", secondWord.toUpperCase());
    }

    private static void exo2Lower() {
        System.out.println("Saisissez 2 mots :");
        String firstWord = sc.nextLine();
        String secondWord = sc.nextLine();
        System.out.printf("Le premier mot en minuscule est : %s%n", firstWord.toLowerCase());
        System.out.printf("Le second mot en minuscule est : %s%n", secondWord.toLowerCase());
    }

    private static void exo3() {
        System.out.println("Donner un mot pour afficher les 2 premiers caractères.");
        String word = sc.next();
        System.out.printf("Les 2 premiers caractères sont : %c & %c", word.charAt(0), word.charAt(1));
    }

    private static void exo4() {
        System.out.println("Donner une phrase pour l'afficher verticalement :");
        String sentence = sc.nextLine();
        for (int charPos = 0; charPos < sentence.length(); ++charPos) {
            System.out.println(sentence.charAt(charPos));
        }
    }

    private static void exo5() {
        System.out.println("Donner un mot pour l'écrire à l'envers :");
        String word = sc.next();
        String inversedWord = reverseString(word);
        System.out.printf("Le mot à l'envers est %s", inversedWord);
    }

    private static void exo6() {
        System.out.println("Donner 2 mots à comparer :");
        String firstWord = sc.next();
        String secondWord = sc.next();
        
        if (firstWord.equals(secondWord)) {
            System.out.println("Les valeurs sont égales !");
        }
        else {
            System.out.println("Les valeurs ne sont pas égales !");
        }
    }

    private static void exo7() {
        System.out.println("Ecrivez un mot pour savoir si c'est un palindrome :");
        String word = sc.next();
        String reversedWord = reverseString(word);
        
        if (word.equals(reversedWord)) {
            System.out.println("C'est un palindrome.");
        }
        else {
            System.out.println("Ce n'est pas un palindrome.");
        }
    }

    private static String reverseString(String string) {
        String inversedString = new String();

        for (int i = string.length() - 1; i >= 0; --i) {
            inversedString += string.charAt(i);
        }

        return inversedString;
    }

    private static void exo8() {
        System.out.println("Donner une lettre pour la compter dans un mot :");
        char letter = sc
            .next()
            .charAt(0);

        System.out.println("Donner un mot pour compter combien de fois la lettre apparait :");
        String word = sc.next();

        int count = 0;
        for (int i = 0; i < word.length(); ++i) {
            if (word.charAt(i) == letter) {
                ++count;
            }
        }

        System.out.printf("Le nombre de fois qu'apparait la lettre %c dans %s est de %d%n", letter, word, count);
    }

    private static void exo9() {
        String email = "s.c.ethan@outlook.fr";
        String[] emailParts = email.split("@");
        System.out.printf("Le nom de l'utilisateur est %s%n", emailParts[0]);
        System.out.printf("Le nom de domaine est %s%n", emailParts[1]);
    }
}