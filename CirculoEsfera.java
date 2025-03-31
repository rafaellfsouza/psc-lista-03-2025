import java.util.Scanner;

public class CirculoEsfera {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int operacao;
        double raio, resultado;
        final double PI = 3.141592; 

        
        System.out.println("Escolha o código da operação:");
        System.out.println("1 - Calcular o perímetro do círculo");
        System.out.println("2 - Calcular a área do círculo");
        System.out.println("3 - Calcular o volume da esfera");

        
        System.out.print("Digite o código da operação (1, 2 ou 3): ");
        operacao = scanner.nextInt();

        System.out.print("Digite o raio: ");
        raio = scanner.nextDouble();

        
        switch (operacao) {
            case 1: 
                resultado = 2 * PI * raio;
                System.out.printf("O perímetro do círculo é: %.2f%n", resultado);
                break;

            case 2: 
                resultado = PI * Math.pow(raio, 2);
                System.out.printf("A área do círculo é: %.2f%n", resultado);
                break;

            case 3: 
                resultado = (4.0 / 3.0) * PI * Math.pow(raio, 3);
                System.out.printf("O volume da esfera é: %.2f%n", resultado);
                break;

            default: 
                System.out.println("Código da operação inválido. Por favor, escolha 1, 2 ou 3.");
                break;
        }

       r
        scanner.close();
    }
}