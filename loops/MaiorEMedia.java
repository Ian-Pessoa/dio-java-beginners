package loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 0;
        int somaNumeros = 0;
        int maiorNumero = 0;

        do {
            System.out.println("Insira um número: ");
            numero = scan.nextInt();
            contador++;
            somaNumeros+=numero;
            if (numero>maiorNumero) maiorNumero = numero;
        } while(contador < 5);

        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Média: " + somaNumeros/5);
    }
}
