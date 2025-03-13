import java.util.Scanner;
public class registro {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("para continuar precisamos de algumas informaçoes.");
        System.out.println ("qual seu nome: ");
        String NomeUsuario = scanner.nextLine();

        System.out.println ("qual sua idade: ");
        int IdadeUsuario = scanner.nextInt();

        if (IdadeUsuario >= 18) {
            System.out.println ("Completo! Bem Vindo " + NomeUsuario);
        }
        else {
            System.out.println ("me desculpa "+ NomeUsuario +", mas o seu registro foi negado");
        }
    }
}
