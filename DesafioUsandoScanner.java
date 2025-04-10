import java.util.Scanner;
public class DesafioUsandoScanner {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque seu nome abaixo: ");
        String NomeDoUsuario = scanner.nextLine();

        System.out.println ("coloque sua idade abaixo: ");
        int IdadeDoUsuario = scanner.nextInt();

        System.out.println("coloque seu genero abaixo: ");
        String Genero = scanner.nextLine();


        System.out.println("Usuario registrado!");

        System.out.println("Nome: " + NomeDoUsuario);
        System.out.println("Idade: "+ IdadeDoUsuario);
        System.out.println("Genero: "+Genero);

    }
}