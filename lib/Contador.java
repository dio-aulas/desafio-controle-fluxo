
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int valor1, valor2;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro número: ");
             valor1 = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Digite um número válido");
            return;
        }
        try {
            System.out.println("Digite o segundo número: ");
            valor2 = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Digite um número válido");
            return;
        }

        try {
            contar(valor1, valor2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void contar(int valor1, int valor2) throws ParametrosInvalidosException {
        if (valor2 <= valor1) {
            throw new ParametrosInvalidosException();
        }
        int contador = valor2 - valor1;
        for (int i = 1; i <= contador; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
