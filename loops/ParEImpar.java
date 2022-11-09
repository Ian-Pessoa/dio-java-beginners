package loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares
e a quantidade de números impares.
 */

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contadorPares=0, contadorImpares=0, contador=0;
        int n;
        int numero;

        System.out.println("Insira quantos números deseja inserir: ");
        n = scan.nextInt();

        do{
            System.out.println("Insira um número: ");
            numero = scan.nextInt();
            if(numero%2==0) contadorPares++;
            else contadorImpares++;
            contador++;
        }while(contador < n);

        System.out.println("Pares: " + contadorPares);
        System.out.println("Ímpares: " + contadorImpares);
    }
}
