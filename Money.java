import java.util.Scanner;

public class Money {
    public static void main (String[]args) {
        float MeuDinheiro = 100.00f;

        float cafe = 25.00f;
        float bolacha = 3.50f;
        float CocaCola = 10.00f;
        float pao1Unidade = 1.00f;
        float maça = 1.50f;

        Scanner scanner = new Scanner(System.in);

        System.out.println ("5 mecadorias disponiveis: \n digite 1 - cafe 25 reais\n diigite 2 - bolacha 3,50 reais\n digite 3 - CocaCola 10,00 reais\n digite 4 - Pao 1,00 real\n digite 5 - pao 1,00 real");

        while (true) {
            int selecionar = scanner.nextInt();
            scanner.nextLine();
            switch (selecionar) {
                case 1:
                    MeuDinheiro -= cafe;
                    System.out.println("voce acabou de comprar um cafe de " + cafe + "reais, seu saldo final e de " + MeuDinheiro + "reais");
                    break;
                case 2:
                    MeuDinheiro -= bolacha;
                    System.out.println("voce acabou de comprar uma bolacha de " + bolacha + "reais, seu saldo final e de " + MeuDinheiro + "reais");
                    break;
                case 3:
                    MeuDinheiro -= CocaCola;
                    System.out.println("voce acabou de comprar uma CocaCola de " + CocaCola + "reais, seu saldo final e de " + MeuDinheiro + "reais");
                    break;
                case 4:
                    MeuDinheiro -= pao1Unidade;
                    System.out.println("voce acabou de comprar um pao de " + pao1Unidade + "reais, seu saldo final e de " + MeuDinheiro + "reais");
                    break;
                case 5:
                    MeuDinheiro -= maça;
                    System.out.println("voce acabou de comprar uma maça de " + maça + "reais, seu saldo final e de " + MeuDinheiro + "reais");
                    break;
                default:
                    System.out.println("opçao invalida!");
                    break;
            }
        }
    }
}