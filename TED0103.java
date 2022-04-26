
import java.util.Scanner;

public class TED0103 {
    public static void main(String[] args) {


        Scanner texto = new Scanner(System.in);
        String corCd;
        System.out.println("Informe a COR do CD para verificar o preço: ");
        corCd = texto.nextLine();
        System.out.println("A cor do CD escolhido foi: " + corCd);

        double cdVerde = 10.0;
        double cdAzul = 20.0;
        double cdAmarelo = 30.0;
        double cdVermelho = 40.0;

        if (corCd.equals("verde")) {
            System.out.println("O valor desse Cd é: 10 reais" );
        } else if (corCd.equals("azul")) {
            System.out.println("O valor desse Cd é: 20 reais");
        } else if(corCd.equals("amarelo")){
            System.out.println("O valor desse Cd é: 30 reais");
        } else if (corCd.equals("vermelho")) {
            System.out.println("O valor desse Cd é: 40 reais");
        }
    }
}
