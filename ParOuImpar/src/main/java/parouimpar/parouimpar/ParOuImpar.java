package parouimpar.parouimpar;

import java.util.Scanner;


public class ParOuImpar {

    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir um número
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verificar se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
    }
}
}
