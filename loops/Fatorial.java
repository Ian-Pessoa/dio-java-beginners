package loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;
        int resultado = 1;

        System.out.println("Insira um número para calcular seu fatorial: ");
        fatorial = scan.nextInt();

        for(int i=1; i<=fatorial; i++){
            resultado*=i;
        }
        System.out.println("O fatorial de " + fatorial + " é " + resultado);
    }
}
