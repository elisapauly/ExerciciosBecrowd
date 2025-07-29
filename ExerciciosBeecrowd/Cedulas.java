import java.io.IOException;
import java.util.Scanner;

public class Cedulas {
 
    public static void main(String[] args) throws IOException {
 
        int valor;
        int N;
        int nota;
        int quantidade;
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        
        Scanner scanner = new Scanner(System.in);
        
        valor = scanner.nextInt();
        N = scanner.nextInt();
        
        System.out.println(valor);
        
        for (nota : 100, 50, 20, 10, 5, 2, 1){
            quantidade = N / nota;
            System.out.println(quantidade + "nota(s) de R$ " + nota + ",00");
            N = N % nota; 
        }
        
    }
 
}