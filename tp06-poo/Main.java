public class Main {

    /*
    2.1 : les méthodes apparaissent en rouge avec l'erreur : 
    "unTrain.x n'est pas visible.""
    */

    public static void main(String[] args) {
        
        Train unTrain = new Train();

        unTrain.setEnMarche(true);
        unTrain.demarrer();

        System.out.println(unTrain.getVitesse());

        unTrain.setVitesse(30);
        System.out.println(unTrain.getVitesse());

        unTrain.setVitesse(60);
        System.out.println(unTrain.getVitesse());

        unTrain.setVitesse(0);
        System.out.println(unTrain.getVitesse());

        unTrain.stopper();
        unTrain.setEnMarche(false);
    }
}