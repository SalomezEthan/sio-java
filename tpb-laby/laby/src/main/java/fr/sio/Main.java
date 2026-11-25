package fr.sio;

import java.io.File;
import java.io.FileReader;
import java.security.InvalidParameterException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Séléctionnez le fichier de l'abyrinthe :");
        
        String filePath = sc.nextLine();
        File file = new File(filePath.trim());

        if (!file.isFile()) {
            sc.close();
            throw new InvalidParameterException("Le fichier n'en est pas un");
        }

        FileReader reader = new FileReader(file);
        List<String> lines = reader.readAllLines();
        reader.close();
        
        final char[][] plateau = new char[10][10];
        for (int i = 0; i < lines.size(); ++i) {
            for (int j = 0; j < lines.get(i).length(); ++j) {
                
                char c = lines
                    .get(i)
                    .charAt(j);

                plateau[i][j] = c;
            }
        } 

        
        final char wall = '#';
        final char breakWall = '@';
        final char player = 'p';
        final char space = ' ';
        final char win = 'w';
        Position playerPos = new Position(1, 1);
        
        System.out.println();
        while (true) {

            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            for (char[] line : plateau) {
                for (char cell : line) {
                    System.out.printf("%c%c", cell, ' ');
                }
                System.out.println();
            }
            
            System.out.println("Entrez votre choix (h, b, g, d) :");
            char userChoice = sc
            .next()
            .charAt(0);
            
            Position newPos = playerPos.clone();
            switch (userChoice) {
                
                case 'h' :
                    --newPos.line;
                    break;
                case 'b' :
                    ++newPos.line;
                    break;
                case 'g' :
                    --newPos.cell;
                    break;
                case 'd' :
                    ++newPos.cell;
                    break;
            }

            char entityAtNewPos = plateau[newPos.line][newPos.cell];

            if (entityAtNewPos == space) {
                plateau[playerPos.line][playerPos.cell] = space;
                plateau[newPos.line][newPos.cell] = player;
                playerPos = newPos;
            } 
            else if (entityAtNewPos == wall) {
                plateau[newPos.line][newPos.cell] = breakWall;
            }
            else if (entityAtNewPos == win) {
                System.out.println("VOUS AVEZ GAGNE !!!");
                break;
            }
        }

        sc.close();
    }

    private static char[][] generateLaby()  {

    }
}

class Position {

    public int line;
    public int cell;

    public Position(int line, int cell) {
        this.line = line;
        this.cell = cell;
    }

    public Position clone() {
        return new Position(
            this.line, 
            this.cell
        );
    }
}