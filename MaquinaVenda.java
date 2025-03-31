import java.util.Scanner;

public class MaquinaVenda {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        double valorCompra, valorPago, troco;
        int notas50 = 0, notas20 = 0, notas10 = 0, notas5 = 0, notas2 = 0, notas1 = 0;

       
        System.out.print("Digite o valor da compra: R$ ");
        valorCompra = scanner.nextDouble();

        
        System.out.print("Digite o valor pago: R$ ");
        valorPago = scanner.nextDouble();

        
        if (valorPago < valorCompra) {
            System.out.println("A quantia paga é insuficiente para realizar a compra.");
        } else {
            // Calcula o troco
            troco = valorPago - valorCompra;
            System.out.printf("Troco: R$ %.2f%n", troco);

            
            int trocoInteiro = (int) Math.round(troco * 100);

            
            notas50 = trocoInteiro / 5000; 
            trocoInteiro %= 5000;

            notas20 = trocoInteiro / 2000; 
            trocoInteiro %= 2000;

            notas10 = trocoInteiro / 1000; 
            trocoInteiro %= 1000;

            notas5 = trocoInteiro / 500; 
            trocoInteiro %= 500;

            notas2 = trocoInteiro / 200; 
            trocoInteiro %= 200;

            notas1 = trocoInteiro / 100; 
            trocoInteiro %= 100;

            
            System.out.println("Notas de R$ 50,00: " + notas50);
            System.out.println("Notas de R$ 20,00: " + notas20);
            System.out.println("Notas de R$ 10,00: " + notas10);
            System.out.println("Notas de R$ 5,00: " + notas5);
            System.out.println("Notas de R$ 2,00: " + notas2);
            System.out.println("Notas de R$ 1,00: " + notas1);
        }

        
        scanner.close();
    }
}