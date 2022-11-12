package arrays;

/*
Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
 */
public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {1,-3,51,2,9};

        for(int i=vetor.length-1 ; i>=0 ; i--){
            System.out.print(vetor[i] + " ");

        }
    }
}
