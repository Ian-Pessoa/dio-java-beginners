package loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o número para ver sua tabuada: ");
        int n = scan.nextInt();

        for(int i = 1;i <= 10;i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
