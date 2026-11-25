public class Cheval {

    private String nom;
    private int age;
    private float taille;
    private int poids;
    private int vitesse;

    public Cheval() {
    }

    public Cheval(String nom, int age, float taille, int poids, int vitesse) {
        this.nom = nom;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
        this.vitesse = vitesse;
    }

    public String versChaine() {
        return String.format(
            "cheval %s, %d ans, %dkg, %fm, vitesse %dkm/h%n", 
            this.nom,
            this.age,
            this.poids,
            this.taille,
            this.vitesse
        );
    }

    public void courir() {
        this.setVitesse(30);
    }

    public void trotter() {
        this.setVitesse(10);
    }

    public void arreter() {
        this.setVitesse(0);
        this.hennir();
    }

    private void hennir() {
        System.out.println("Je hennis !");
    }

    public String getNom() {
        return this.nom;
    }

    public int getAge() {
        return this.age;
    }

    public int getPoids() {
        return this.poids;
    }

    public float getTaille() {
        return this.taille;
    }

    public int vitesse() {
        return this.vitesse;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }
}