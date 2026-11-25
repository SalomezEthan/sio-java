import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        exo5();
    }

    private static void exo2() {
        final double a = sc.nextDouble();
        final double b = sc.nextDouble();

        final double max = Math.max(a, b);
        System.out.println("Le nombre le plus grand est " + max);

        final double min = Math.min(a, b);
        System.out.println("La nombre le plus petit est " + min);
        
        final double pow = Math.pow(a, b);
        System.out.println("Le nombre 1 à la puissance du nombre 2 est " + pow);
    }

    private static void exo3() {
        final double num = 21.;
        
        final double sqrt = Math.sqrt(num);
        System.out.println("La racine carré de " + num + " est " + sqrt);

        final double sqrtRounded = Math.round(sqrt);
        System.out.println("La valeur arrondie la plus proche est " + sqrtRounded);
    }

    private static void exo4() {
        System.out.println("Vérif âge :");
        final int age = sc.nextInt();
        printMinorOrMajor(age);
    }

    private static void printMinorOrMajor(int age) {
        if (age < 18) {
            System.out.println("Mineur");
        }
        else {
            System.out.println("Majeur");
        }
    }

    private static void exo5() {
        System.out.println("Entrez un nombre :");
        int num = sc.nextInt();
        System.out.println("La valeur absolue est " + getAbsoluteValue(num));
    }

    private static int getAbsoluteValue(int num) {
        
        if (num > 0) {
            return num;
        }
        
        return num - num * 2;

    }

    private static void exo6() {
        System.out.println("Entrez vos valeurs pour calculer la moyenne :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("La moyenne est " + getAverage(a, b));
    }

    private static int getAverage(int a, int b) {
        return (a + b) / 2;
    } 

    private static void exo7() {
        System.out.println("Entrez une lettre :");
        char letter = sc
            .next()
            .trim()
            .charAt(0);


        System.out.println("La majuscule est " + getUppercase(letter));
    }

    private static char getUppercase(char c) {
        
        if (c < 90) {
            return c;
        }

        return (char)((int)c - 32);
    }

    private static void exo8() {
        String name = input("Entrez votre nom :");
        String domain = input("Entrez le domaine :");
        String country = input("Entrez votre pays (ex : fr, com)");
        System.out.println("L'email est : " + generateEmail(name, domain, country));
    }

    private static String input(String question) {
        System.out.println(question);
        return sc.next();
    }

    private static String generateEmail(String name, String domain, String country) {
        return String.format("%s@%s.%s", name, domain, country);
    }

    public static void exo9() {
        // à la suite
        int n = 1000;
        System.out.println("dans main, n vaut : " + n);
        modifier(n);
        System.out.println("à la fin de main, n vaut : " + n);
    }

    public static void modifier(int n) {
        System.out.println("Début de la fonction modifier");
        n = 0;
        System.out.println("n vaut : " + n);
    }

    /*
    Java comme beaucoup de langage de programmation peut copier certains types (explicitement dit via "sûrement" une interface).
    Un nombre fait parti des types copiés au passage d'une fonction. Ce qui ne permet pas de modifier réellement la valeur.
    Pour modifier une valeur via une fonction, il faut un passage par référence. (pointeur ou emprunt comme en Rust)
    */
}