public class Train {
    
    private int vitesse = 0;
    private boolean enMarche = false;

    public void demarrer() {
        System.out.println("Démarrage");
    }

    public void stopper() {
        System.out.println("Arrêt");
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public void setEnMarche(boolean state) {
        this.enMarche = state;
    }
}
