import java.io.IOException;
import java.util.Scanner;
 
public class Diferenca {
 
    public static void main(String[] args) throws IOException {
 
        int A;
        int B;
        int C;
        int D;
        int DIFERENCA;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o priemeiro número: ");
        A = scanner.nextInt();
        
        System.out.println("Digite o segundo número: ");
        B = scanner.nextInt();
        
        System.out.println("Digite o terceiro número: ");
        C = scanner.nextInt();
        
        System.out.println("Digite o quarto número: ");
        D = scanner.nextInt();
        
        DIFERENCA = (A*B - C*D);
        
        System.out.println("DIFERENCA = "+DIFERENCA);
 
    }
 
}