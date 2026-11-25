package tpifelse;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    static void main() {
        exo2Fin();
    }

    private static void exo2() {
        System.out.println("Selectionner votre âge :");
        int ageUtilisateur = sc.nextInt();

        if (ageUtilisateur >= 18) {
            System.out.println("Vous êtes majeur !");
        }
        else {
            System.out.println("Vous êtes mineur !");
        }
    }

    private static void exo3() {
        System.out.println("Ecrivez 2 nombres pour savoir quel est le plus grand :");
        int nombre1 = sc.nextInt();
        int nombre2 = sc.nextInt();

        if (nombre1 > nombre2) {
            System.out.println("Le premier nombre est supérieur.");
        }
        else {
            System.out.println("Le second nombre est supérieur.");
        }
    }

    private static void exo4() {
        System.out.println("Donner un nombre pour savoir s'il est positif, négatif ou nul :");
        int nombre = sc.nextInt();

        if (nombre > 0) {
            System.out.println("Votre nombre est positif.");
        }
        else if (nombre < 0) {
            System.out.println("Votre nombre est négatif.");
        }
        else {
            System.out.println("Votre nombre est égal à 0, soit nul.");
        }
    }

    private static void exo5() {
        System.out.println("Entrez votre âge pour connaitre le prix de votre place de ciné.");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("L'âge ne peut être en dessous de 0");
        }

        int prix;
        if (age < 5) {
            prix = 2;
        }
        else if (age <= 17) {
            prix = 5;
        }
        else {
            prix = 9;
        }

        System.out.println("Votre billet est à " + prix + "€");
    }

    private static void exo6() {
        System.out.println("Entrez votre température.");
        int temp = sc.nextInt();

        if (temp >= 36 && temp <= 38) {
            System.out.println("Ok");
        }
        else {
            System.out.println("Allez voir un médecin.");
        }
    }

    private static void exo7() {
        System.out.println("Entrez le montant de la vente");
        float montant = sc.nextFloat();

        float taux;
        if (montant <= 10000) {
            taux = 10;
        }
        else if (montant <= 20000) {
            taux = 20;
        }
        else {
            taux = 30;
        }

        System.out.println("Le taux s'élève à " + taux + "%");

        float prixFinal = montant * (1 - (taux / 100));
        System.out.println("Le montant final s'élève à " + prixFinal + "€");
    }

    private static void exo8() {
        ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
        pizzas.add(new Pizza("Reine", 9));
        pizzas.add(new Pizza("Quatre fromages", 11));
        pizzas.add(new Pizza("Napolitaine", 10));
        pizzas.add(new Pizza("Quatre saisons", 11));
        pizzas.add(new Pizza("Calzone", 11));
        pizzas.add(new Pizza("Hawaîenne", 12));

        System.out.println("N°\tPizza\tPrix");
        for (int i = 0; i < pizzas.size(); i++) {
            Pizza pizza = pizzas.get(i);
            System.out.println(String.format("%d\t%s\t%d€", i+1, pizza.nom, pizza.prix));
        }

        StringBuilder builder = new StringBuilder();
        int prix = 0;

        System.out.println("Choisissez une pizza par son n° :");
        int pizzaChoisinb = sc.nextInt();
        Pizza pizzaChoisi = pizzas.get(pizzaChoisinb - 1);

        System.out.println("Choisissez le nombre de pizza que vous voulez :");
        int nombrePizza = sc.nextInt();
        prix += pizzaChoisi.prix * nombrePizza;

        builder
                .append(String.format("Vous avez choisi %d pizzas %s\n", nombrePizza, pizzaChoisi.nom))
                .append("Supplément :");

        System.out.println("Avec oeuf ?");
        boolean avecOeuf = sc.nextBoolean();
        if (avecOeuf) {
            prix += 1;
            builder.append("Oeuf");
        }

        System.out.println("Avec aubergine ?");
        boolean avecAubergine = sc.nextBoolean();
        if (avecAubergine) {
            prix += 2;
            builder.append(", Aubergine");
        }
        
        builder
                .append('\n')
                .append(String.format("Le prix est de %d€", prix));

        System.out.println(builder.toString());
    }

    private static void exo1Fin() {
        System.out.println("Veuillez entrer le nombre d'heures :");
        float nombreHeures = sc.nextFloat();

        if (nombreHeures < 50) {
            System.out.println("Il faudrait bosser un peu plus !");
        }

        System.out.println("Nombre d'heures sup : ");
        float heureSups = sc.nextFloat();

        if (nombreHeures + heureSups > 140) {
            nombreHeures += heureSups;
        }

        System.out.println("Veuillez entrer le salaire honoraire :");
        float salaireHonoraire = sc.nextFloat();

        if (salaireHonoraire > 100) {
            System.out.println("On arrête tout ! L'employé gagne plus que le patron !");
            return;
        }

        float salaire = salaireHonoraire * nombreHeures;
        System.out.println(String.format("Le salaire brut est de %f€", salaire));

        salaire = salaire * (1 - 22f / 100);
        System.out.println(String.format("La sécu prend 22%%. le salaire tombe à %f€", salaire));

        System.out.println(String.format("Combien d'ancienneté :"));
        float ancienneté = sc.nextFloat();

        float prime = 0;
        if (ancienneté > 20) {
            prime = 5f;
        }
        else if (ancienneté > 10) {
            prime = 2f;
        }
        System.out.println(String.format("Sa prime s'élève à %f%%", prime));

        if (prime > 0) {
            salaire = salaire * (1 + prime / 100);
        }

        System.out.println("Grade : ");
        float grade = sc.nextFloat();
        System.out.println(String.format("Vous avez une prime de grade de : %f%%", grade));

        float primeGrade = salaire * grade / 100;
        salaire += primeGrade;
        System.out.println(String.format("Votre prime de grade rajoute %f€", primeGrade));
        System.out.println(String.format(String.format("Le salaire final est de %f€", salaire)));
    }

    private static void exo2Fin() {
        System.out.println("Entrez 2 nombres :");
        double na = sc.nextDouble();
        double nb = sc.nextDouble();
        String ope = sc.next();

        double result;
        switch (ope) {
            case "+" :
                result = na + nb;
                break;
            case "-":
                result = na - nb;
                break;
            case "*":
                result = na * nb;
                break;
            case "/":
                result = na / nb;
                break;
            default:
                System.out.println("L'opérateur est inconnu");
                return;
        }
        System.out.println(String.format("Le résultat est : %f", result));
    }
}
