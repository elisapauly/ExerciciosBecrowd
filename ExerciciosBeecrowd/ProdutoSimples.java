import java.io.IOException;
import java.util.Scanner;

public class ProdutoSimples {

    public static void main(String[] args) throws IOException {

    int A;
    int B;
    int PROD;

    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite um número para multiplicar: ");
    A = scanner.nextInt();
    
    System.out.println("Digite outro número para multiplicar: ");
    B = scanner.nextInt();
    
    PROD = (A * B);
    
    System.out.println("PROD = "+PROD);
    
    }

}
