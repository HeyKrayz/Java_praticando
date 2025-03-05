import java.util.Scanner;
public class quiz {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontos = 0;

        System.out.println ("bem vindo ao quiz (feito em java)");
        System.out.println ("qual desses personagens e do anime solo leveling?");
        System.out.println ("1- jin woo, 2- isagi, 3- gustavo guanabara (responda conforme o numero por favor)");

        int fala = scanner.nextInt();

        if (fala == 1) {
            System.out.println("Acertou! o personagem correto e o sung jin woo");
            pontos ++;
        }
        else if (fala == 2) {
            System.out.println("errado, isagi e de blue lock");
        }
        else if (fala == 3) {
            System.out.println ("voce escolheu essa opçao so para trollar ne? kkk, menos -1 ponto");
            pontos --;
        }

        scanner.nextLine();
        
        System.out.println("qual personagem e o mais forte dos 3? 4- luffy, 5- ichigo, 6- naruto");
        int pergunta = scanner.nextInt();

        if (pergunta == 4) {
            System.out.println ("o luffy e muito forte, mas acho q nao e mais forte q os outros.");
        }
        else if (pergunta == 5) {
            System.out.println("Certo, ichigo e o mais forte entre os 3");
            pontos ++;
        }
        else if (pergunta == 6) {
            System.out.println ("errado, nao e o naruto");
        }
        System.out.println ("acabou o quiz, sim so teve 2 perguntas, sua pontuaçao foi de: "+ pontos);

    }
}