import java.util.Scanner;
public class ControlFlow {
    public static void main (String []args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("digite o primeiro valor abaixo: ");
        int Valor1 = scanner.nextInt();
        System.out.println("agora o segundo valor: ");
        int Valor2 = scanner.nextInt();

        try {
            conta(Valor1, Valor2);
        }
        catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }
        public static void conta (int Valor1, int Valor2) throws ParametrosInvalidosException {
            if (Valor1 > Valor2) {
                throw new ParametrosInvalidosException("O segundo numero deve ser maior que o primeiro");
            }

            int contagem = Valor2 - Valor1;
            for (int x = 1; x <= contagem; x++) {
            System.out.println("imprimindo: "+ x);
            }
        }
    }