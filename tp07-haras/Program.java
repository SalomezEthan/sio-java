class Program {

    public static void main(String[] args) {
        Cheval stewball = new Cheval("Stewball", 3, 1.5f, 500, 0);
        System.out.println(stewball.versChaine());

        System.out.println("Définir vitesse :");
        stewball.setVitesse(20);
        System.out.println(stewball.versChaine());

        System.out.println("Trotter :");
        stewball.trotter();
        System.out.println(stewball.versChaine());

        System.out.println("Courrir :");
        stewball.courir();
        System.out.println(stewball.versChaine());

        System.out.println("Arreter :");
        stewball.arreter();
        System.out.println(stewball.versChaine());
    }

}