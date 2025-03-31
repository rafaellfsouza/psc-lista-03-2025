import java.util.Scanner;
import java.util.Random;

public class SorteioNumero {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        int numero1, numero2, menor, maior, numeroSorteado;

        
        System.out.print("Digite o primeiro número inteiro: ");
        numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        numero2 = scanner.nextInt();

        
        if (numero1 < numero2) {
            menor = numero1;
            maior = numero2;
        } else {
            menor = numero2;
            maior = numero1;
        }

        
        if (menor == maior) {
            System.out.println("Os números informados são iguais. Não é possível realizar o sorteio.");
            scanner.close();
            return;
        }

       
        numeroSorteado = random.nextInt(maior - menor + 1) + menor;

        
        if (numeroSorteado % 2 == 0) {
            System.out.println("O número sorteado foi: " + numeroSorteado + " e ele é par.");
        } else {
            System.out.println("O número sorteado foi: " + numeroSorteado + " e ele é ímpar.");
        }

        
        scanner.close();
    }
}