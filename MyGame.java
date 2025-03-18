import java.util.Scanner;
import java.util.Random;

public class MyGame {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random ();
        
        int inimigo_atual;
        int VidaPlayer = 100;
        int VidaGoblins = 25;
        int DanoPlayer = 5 + random.nextInt(6);
        int DanoGoblin = 5;
        byte Xp = 0;
        byte Level = 1;


        System.out.println ("seja bem vindo ao jogo! prencha as informaçoes a baixo, E DIGITE HELP PARA VER LISTA DE COMANDOS!");
        System.out.println ("qual vai ser seu nick: ");

        String nickname = scanner.nextLine();
        

        System.out.println ("Player: "+ nickname + " Hp: " + VidaPlayer + System.lineSeparator() + "derrote o primeiro inimigo. goblin " + "Hp: "+ VidaGoblins);

            while (VidaPlayer > 0) {

                String digitarPlayer = scanner.nextLine();
                if (VidaGoblins <= 0) {
                    System.out.println ("parabens, voce derrotou um goblin! Seu Xp: "+ Xp + " seu level: " + Level);
                    Xp += 10;
                }
                if (VidaPlayer < 0) {
                    break;
                }

            
            if (digitarPlayer.equals ("atk")) {
                System.out.println ("Voce atacou o goblin, causando: "+ DanoPlayer );
                DanoPlayer -= VidaGoblins;
            }
            if (VidaGoblins > 0) {
                System.out.println ("O goblin te atacou causando: "+ DanoGoblin);
                DanoGoblin -= VidaPlayer;
            }
               }

    }
}