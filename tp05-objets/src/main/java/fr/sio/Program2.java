package fr.sio;

import java.io.File;
import java.util.Date;
import java.util.Random;;

public class Program2 {

    private final Random rand = new Random();

    public void printDateNow() {
        System.out.println(new Date());
    }

    public int getRandomNumberBetween0And10k() {
        return rand.nextInt(10_000);
    }

    public void lastExo(String filePath) {
        File dir = new File(filePath);

        if (dir.exists()) {
            System.out.println("Le dossier existe");
        }

        if (dir.isDirectory()) {
            System.out.println("C'est un dossier");
        }

        System.out.println(dir.toURI());
        System.out.println(dir.toString());
    }
}
