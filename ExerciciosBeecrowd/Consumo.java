import java.io.IOException;
import java.util.Scanner;

public class Consumo {
 
    public static void main(String[] args) throws IOException {
 
      int distancia;
      double combustivel;
      double consumoMedio;
      
      Scanner scanner = new Scanner(System.in);
      
      distancia = scanner.nextInt();
      combustivel = scanner.nextDouble();
      
      consumoMedio = (distancia / combustivel);
      
      System.out.printf("%.3f km/l%n", consumoMedio);
      
 
    }
 
}