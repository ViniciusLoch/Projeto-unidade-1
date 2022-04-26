import java.util.Scanner;

public class TED0104 {
    public static void main(String[] args) {

        TED0104 calc = new TED0104();
        calc.numeros(3);
    }

    public void numeros(int qtd) {

        Scanner scan = new Scanner(System.in);
        int numero;
        int maiorNumero = 0;
        int menorNumero = 0;

        for( int i = 0; i < qtd; i++ ) {

            System.out.println("Digite o número " + (i + 1) + ":");
            numero = scan.nextInt();

            if (i == 0) {
                maiorNumero = numero;
                menorNumero = numero;
            }

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("O menor numero é: " + menorNumero);
    }
}
