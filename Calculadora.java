import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        double numero1, numero2, resultado = 0;
        char operacao;

        
        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        System.out.print("Digite o símbolo da operação (+, -, *, / ou ^): ");
        operacao = scanner.next().charAt(0);

        
        switch (operacao) {
            case '+': 
                resultado = numero1 + numero2;
                break;

            case '-': 
                resultado = numero1 - numero2;
                break;

            case '*': 
                resultado = numero1 * numero2;
                break;

            case '/': 
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    scanner.close();
                    return; 
                }
                break;

            case '^':
                resultado = Math.pow(numero1, numero2);
                break;

            default: 
                System.out.println("Erro: Símbolo da operação inválido.");
                scanner.close();
                return; 
        }

        
        System.out.printf("Resultado: %.2f%n", resultado);

        
        scanner.close();
    }
}