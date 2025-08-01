import java.io.IOException;
import java.util.Scanner;

public class Cedulas {
 
    public static void main(String[] args) throws IOException {
 
        int N;
        int valor;
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        
        Scanner scanner = new Scanner(System.in);
        
        N = scanner.nextInt();
        valor = N;
        
        System.out.println(valor);
        
        for (int nota : notas) {
            int quantidade = N / nota;
            System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
            N %= nota;
        }
        
        scanner.close();
 
    }
 
}