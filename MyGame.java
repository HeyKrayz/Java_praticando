import java.util.Scanner;
public class MyGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int VidaPlayer = 100;
        int VidaGoblins = 25;
        int VidaLobo = 50;
        int DanoPlayer = 5;
        int DanoGoblin = 5;
        int DanoLobo = 10;
        byte Xp = 0;
        byte Level = 1;

        System.out.println("Seja bem-vindo ao jogo! Preencha as informações abaixo e digite 'atk' para atacar.");
        System.out.println("Qual vai ser seu nick?");
        String nickname = scanner.nextLine();

        System.out.println("Player: " + nickname + " Hp: " + VidaPlayer + "\nDerrote o primeiro inimigo, Goblin! Hp: " + VidaGoblins);

        while (VidaPlayer > 0) {
            while (VidaGoblins > 0) {
                System.out.println("Digite 'atk' para atacar o Goblin:");
                String digitarPlayer = scanner.nextLine();

                if (digitarPlayer.equals("atk")) {
                    System.out.println("Você atacou o Goblin, causando: " + DanoPlayer);
                    VidaGoblins -= DanoPlayer;
                    System.out.println("Hp do Goblin: " + VidaGoblins);
                }

                if (VidaGoblins > 0) {
                    System.out.println("O Goblin te atacou, causando: " + DanoGoblin);
                    VidaPlayer -= DanoGoblin;
                    System.out.println("Seu Hp: " + VidaPlayer);
                }

                if (VidaPlayer <= 0) {
                    System.out.println("Game Over...");
                    break;
                }
            }

            if (VidaPlayer <= 0) {
                System.out.println("Game Over...");
                break;
            }

            System.out.println("Parabéns, você derrotou um Goblin! Seu Xp: " + Xp + " Seu level: " + Level);
            Xp += 10;
            VidaGoblins = 25; 

            if (Xp >= 30) {
                Level++;
                VidaPlayer += 5;
                DanoPlayer += 2;
                Xp = 0;
                System.out.println("Level Up! Você está no level " + Level);
            }

            System.out.println("Você derrotou o Goblin. Deseja continuar lutando contra Goblins ou mudar para Lobos?");
            System.out.println("1 - Continuar lutando contra Goblins");
            System.out.println("2 - Ir para os Lobos");

            String escolhaInput = scanner.nextLine();
            int escolha = Integer.parseInt(escolhaInput);

            if (escolha == 2) {
                System.out.println("Você escolheu lutar contra Lobos!");
                System.out.println("Lobo Hp: " + VidaLobo);
                System.out.println(nickname + " Hp: " + VidaPlayer);

                while (VidaPlayer > 0 && VidaLobo > 0) {
                    System.out.println("Digite 'atk' para atacar o Lobo:");
                    String comands = scanner.nextLine();

                    if (comands.equals("atk")) {
                        VidaLobo -= DanoPlayer;
                        System.out.println("Você atacou o Lobo, causando: " + DanoPlayer);
                        System.out.println("Hp do Lobo: " + VidaLobo);
                    }

                    if (VidaLobo > 0) {
                        System.out.println("O Lobo te atacou, causando: " + DanoLobo);
                        VidaPlayer -= DanoLobo;
                        System.out.println("Seu Hp: " + VidaPlayer);
                    }

                    if (VidaPlayer <= 0 || VidaLobo <= 0) {
                        break;
                    }
                }
            }
        }
    }
}
