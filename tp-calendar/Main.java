import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        exo3();
    }

    private static void exo1() {
        GestionnaireRdv rdv = new GestionnaireRdv();
        rdv.printTodayWithSlash();
        rdv.printCompleteDate();
    }

    private static void exo3() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("L'objet du rendez-vous :");
        String objet = sc.nextLine();

        System.out.println("Le jour :");
        int day = sc.nextInt();

        System.out.println("Le mois prévu pour le rendez-vous (1-12) :");
        int mounth = sc.nextInt() - 1;

        System.out.println("L'année prévue du rdv :");
        int year = sc.nextInt();

        Calendar rdvDate = Calendar.getInstance();
        rdvDate.set(Calendar.YEAR, year);
        rdvDate.set(Calendar.MONTH, mounth);
        rdvDate.set(Calendar.DAY_OF_MONTH, day);
        rdvDate.set(Calendar.HOUR_OF_DAY, 14);
        rdvDate.set(Calendar.MINUTE, 30);

        Calendar today = Calendar.getInstance();
        if (rdvDate.before(today)) {
            System.out.println("Impossible de donner une date déjà passée :(");
            System.exit(1);
        }

        RendezVous rdv = new RendezVous(objet, rdvDate);
        System.out.println("Rendez-vous créé !");

        Calendar rappel = rdv.getDateRappel();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE d LLLL y à k:m");
        System.out.println("Le rappel de votre rendez-vous est fixé 48h avant. Soit :");
        System.out.printf("Le %s%n", formatter.format(rappel.getTime()));

        System.out.println("Souhaitez-vous reporter le rdv ? (oui, non)");
        String response = sc
            .next()
            .trim()
            .toLowerCase();

        if (response.equals("oui")) {
            rdv.reporter();
            System.out.println("Le rendez-vous a été reporté avec succès !");
            
        }

        System.out.println(rdv.toString());
        System.out.printf("Il reste %d jours restants.%n", rdv.getJoursRestants());

        sc.close();
        System.out.println("Fin de la procédure.");
    }
}