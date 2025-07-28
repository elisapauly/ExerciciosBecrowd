import java.io.IOException;
import java.util.Scanner;
 
public class CalculoSimples {
 
    public static void main(String[] args) throws IOException {
 
       int codigoPeca1;
       int numeroPeca1;
       double valorPeca1;
       int codigoPeca2;
       int numeroPeca2;
       double valorPeca2;
       double valor1;
       double valor2;
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.println(" | PEÇA 1 | Informe o código da peça, a quantidade e o valor: ");
       codigoPeca1 = scanner.nextInt();
       numeroPeca1 = scanner.nextInt();
       valorPeca1 = scanner.nextDouble();
       
       System.out.println(" |PEÇA 2 | Informe o código da peça, a quantidade e o valor: ");
       codigoPeca2 = scanner. nextInt();
       numeroPeca2 = scanner.nextInt();
       valorPeca2 = scanner.nextDouble();
       
       valor1 = (numeroPeca1 * valorPeca1);
       valor2 = (numeroPeca2 * valorPeca2);
       
       System.out.println("VALOR A PAGAR: R$ "+valor1+valor2);
 
    }
 
}