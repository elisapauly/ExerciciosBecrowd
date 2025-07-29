import java.io.IOException;
import java.util.Scanner;

public class GastoDeCombustivel {
 
    public static void main(String[] args) throws IOException {
 
       int tempo;
       int velocidade;
       double litros;
       
       Scanner scanner = new Scanner(System.in);
       
       tempo = scanner.nextInt();
       velocidade = scanner.nextInt();
       
       litros = (velocidade* tempo) / 12.0;
       
       System.out.printf("%.3f%n", litros);
 
    }
 
}