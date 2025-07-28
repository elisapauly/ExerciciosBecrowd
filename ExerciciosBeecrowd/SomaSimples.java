import java.io.IOException;
import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) throws IOException {
        
    int A;
    int B;
    int SOMA;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite um número para somar: ");
    A = scanner.nextInt();
    
    System.out.println("Digite outro número: ");
    B = scanner.nextInt();
    
    SOMA = (A+B);
    
    System.out.println("SOMA = "+SOMA);


    }

}
