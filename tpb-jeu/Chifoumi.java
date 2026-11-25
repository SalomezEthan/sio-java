import java.util.Random;
import java.util.Scanner;

public class Chifoumi {
    
    private final int PIERRE = 1;
    private final int PAPIER = 2;
    private final int CISEAUX = 3;
    
    private final Scanner sc = new Scanner(System.in);
    private final Random rand = new Random();
    
    private int nbManches;
    private int mancheActuelle;
    
    private int choixJoueur;
    private int choixMachine;
    
    private int scoreJoueur;
    private int scoreMachine;
    
    private Boolean avecTriche = true;
    
    public void jouer() {
        choisirNombreManches();
        jouerJeu();
        annoncerScores();
    }
    
    private void choisirNombreManches() {
        System.out.println("Combien de manche voulez vous jouer : ");
        nbManches = sc.nextInt();
    }
    
    private void jouerJeu() {
        for (mancheActuelle = 1; mancheActuelle <= nbManches; ++mancheActuelle) {
            genererChoixMachine();
            demanderChoixUtilisateur();
            deciderGagnantManche();
        }
    }
    
    private void demanderChoixUtilisateur() {
        afficherChoix();
        choixJoueur = sc.nextInt();
    }
    
    private void afficherChoix() {
        System.out.printf("Manche %d%n", mancheActuelle);
        System.out.println("Veuillez entrer votre choix :");
        System.out.println("1. Pierre");
        System.out.println("2. Papier");
        System.out.println("3. Ciseaux");
    }
    
    private void genererChoixMachine() {
        choixMachine = rand.nextInt(3) + 1;
        if (avecTriche) {
            System.out.println("Le choix de la machine : " + choixMachine);
        }
    }
    
    private void deciderGagnantManche() {
        if (choixSontEgaux()) {
            --mancheActuelle;
            System.out.println("EGALITE");
        }
        else if (joueurEstGagnant()) {
            ++scoreJoueur;
            System.out.println("Vous avez gagné !");
            
        }
        else {
            ++scoreMachine;
            System.out.println("L'ordinateur vous a battu.");
        }
        
        private Boolean choixSontEgaux() {
            return choixJoueur == choixMachine;
        }
        
        private Boolean joueurEstGagnant() {
            return choixJoueur == PIERRE && choixMachine == CISEAUX 
            || choixJoueur == PAPIER && choixMachine == PIERRE 
            || choixJoueur == CISEAUX && choixMachine == PAPIER;
        }
        
        private void annoncerScores() {
            afficherScore();
            afficherGagnant();
        }
        
        private void afficherScore() {
            System.out.println("Les scores sont :");
            System.out.printf("Joueur : %d%n", scoreJoueur);
            System.out.printf("Ordinateur : %d%n", scoreMachine);
        }
        
        private void afficherGagnant() {
            if (scoreJoueur > scoreMachine) {
                System.out.println("BRAVO ! Vous avez gagné la partie !");
            }
            else if (scoreJoueur == scoreMachine) {
                System.out.println("EGALITE ENTRE LES 2 PARTIES. RETENTEZ VOTRE CHANCE !");
            }
            else {
                System.out.println("DOMMAGE... L'ordinateur a gagné...");
            }
        }
    }