import java.util.Scanner;
public class soloLeveling {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int xp = 0;
        int level = 0;
        while (true) {
        String  digitar = scanner.nextLine();
        
        if (digitar.equals ("erga-se")) {
            xp += 5;
            System.out.println ("seu xp e de: " + xp);
            }

        if (xp >= 10) {
            System.out.println ("Level Up, Voce esta no Level: "+ level);
            xp = 0;
            level ++;
            }
        }
    }
}
