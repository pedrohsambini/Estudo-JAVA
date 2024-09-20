import java.util.Scanner;

public class SomaNumeros {

    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir o primeiro número
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        // Solicitar ao usuário para inserir o segundo número
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Calcular a soma dos dois números
        int soma = numero1 + numero2;

        // Exibir o resultado
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + soma);
    }
}
