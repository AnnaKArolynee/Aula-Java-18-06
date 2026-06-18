import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sucesso = false;

        while (!sucesso) {
            try {
                System.out.print("Digite o primeiro número inteiro (dividendo): ");
                int num1 = scanner.nextInt();

                System.out.print("Digite o segundo número inteiro (divisor): ");
                int num2 = scanner.nextInt();

                double resultado = (double) num1 / num2;

                if (num2 == 0) {
                    throw new ArithmeticException("/ by zero");
                }

                System.out.printf("\n Sucesso! O resultado de %d dividido por %d é: %.2f\n", num1, num2, resultado);
                sucesso = true; // Sai do loop

            } catch (InputMismatchException e) {
                System.out.println("Ops! Você não digitou um número inteiro válido. Vamos tentar de novo.\n");
                scanner.nextLine(); // Limpa o buffer do scanner para evitar loop infinito
            } catch (ArithmeticException e) {
                System.out.println("Erro: Não é possível dividir um número por zero! Tente novamente.\n");
            }
        }

        scanner.close();
    }
}
