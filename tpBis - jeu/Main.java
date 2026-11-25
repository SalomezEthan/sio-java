import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {
        devineLeNombre();
    }

    private static void pierreFeuilleCiseaux() {
        System.out.println("Combien de manche voulez vous jouer : ");
        int nbManches = sc.nextInt();

        final int PIERRE = 1;
        final int PAPIER = 2;
        final int CISEAUX = 3;

        int scoreJoueur = 0;
        int scoreOrdinateur = 0;

        for (int manche = 1; manche <= nbManches; ++manche) {
            System.out.printf("Manche %d%n", manche);
            System.out.println("Veuillez entrer votre choix :");
            System.out.println("1. Pierre");
            System.out.println("2. Papier");
            System.out.println("3. Ciseaux");

            int choixJoueur = sc.nextInt();
            int choixOrdinateur = rand.nextInt(4);
            System.out.println(choixOrdinateur);

            if (choixJoueur == choixOrdinateur) {
                --manche;
                System.out.println("EGALITE");
            }
            else if (choixJoueur == PIERRE && choixOrdinateur == CISEAUX 
                || choixJoueur == PAPIER && choixOrdinateur == PIERRE 
                || choixJoueur == CISEAUX && choixOrdinateur == PAPIER ) {
                    ++scoreJoueur;
                    System.out.println("Vous avez gagné !");
            }
            else {
                ++scoreOrdinateur;
                System.out.println("L'ordinateur vous a battu.");
            }
        }

        System.out.println("Les scores sont :");
        System.out.printf("Joueur : %d%n", scoreJoueur);
        System.out.printf("Ordinateur : %d%n", scoreOrdinateur);

        if (scoreJoueur > scoreOrdinateur) {
            System.out.println("BRAVO ! Vous avez gagné !");
        }
        if (scoreJoueur == scoreOrdinateur) {
            System.out.println("EGALITE ENTRE LES 2 PARTIES. RETENTEZ VOTRE CHANCE !");
        }
        else {
            System.out.println("DOMMAGE... L'ordinateur a gagné...");
        }
    }

    private static void devineLeNombre() {

        final int solution = rand.nextInt(101);
        System.out.println(solution);
        int essaies = 0;

        while (true) {

            System.out.println("Devinez le nombre entre 0 et 100 :");
            int nombre = sc.nextInt();

            if (nombre == solution) {
                System.out.printf("Vous avez gagné en %d essaies ! Le nombre était %d%n", essaies, solution);
                break;
            }

            int pourcentage;
            if (nombre < solution) {
                pourcentage = (int)(((float)nombre / (float)solution) * 100);
            }
            else {
                pourcentage = (int)((float)solution / (float)nombre * 100);
            }
            
            System.out.println(pourcentage);
            
            if (pourcentage <= 50) {
                System.out.println("Tu es loin !");
            }
            else if (pourcentage <= 75) {
                System.out.println("Tu chauffes !");
            }
            else {
                System.out.println("Tu brûles !");
            }

            final int progressBarLength = 25;
            final int numberOfFilledChar = (int)((float)progressBarLength * ((float)pourcentage / 100));

            System.out.print('[');
            for (int i = 0; i < progressBarLength; ++i) {
                if (i < numberOfFilledChar) {
                    System.out.print('#');
                }
                else {
                    System.out.print('=');
                }
            }
            System.out.print("]\n");

            ++essaies;
        }
    }
}