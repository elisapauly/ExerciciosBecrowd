import java.io.IOException;
import java.util.Scanner;

public class ExtramamenteBasico {

    public static void main(String[] args) throws IOException {

    int A;
    int B;
    int valorX;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite um número para somar: ");
    A = scanner.nextInt();
    
    System.out.println("Digite outro número: ");
    B = scanner.nextInt();
    
    valorX = (A+B);
    
    System.out.println("X = "+valorX);
    
    }

}
