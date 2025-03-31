import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        double numero1, numero2, numero3;
        double maior, menor, media;

        
        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        numero3 = scanner.nextDouble();

        
        maior = numero1;
        if (numero2 > maior) {
            maior = numero2;
        }
        if (numero3 > maior) {
            maior = numero3;
        }

        
        menor = numero1;
        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }

        
        media = (numero1 + numero2 + numero3) / 3;

        // Exibe os resultados
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média aritmética é: " + media);

       
        scanner.close();
    }
}