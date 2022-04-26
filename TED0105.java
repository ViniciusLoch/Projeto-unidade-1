import java.util.Scanner;

public class TED0105 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um numero INTEIRO: ");
        int numero = scan.nextInt();

        if(numero % 2 == 0){
            System.out.print("Você informou um numero par");
        }
        else{
            System.out.print("Você informou um numero impar");
        }
    }
}
