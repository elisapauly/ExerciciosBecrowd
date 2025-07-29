import java.io.IOException;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {
 
    public static void main(String[] args) throws IOException {
 
    double x1;
    double y1;
    double x2;
    double y2;
    double distancia;
    
    Scanner scanner = new Scanner(System.in);
    
    x1 = scanner.nextDouble();
    y1 = scanner.nextDouble();
    
    x2 = scanner.nextDouble();
    y2 = scanner.nextDouble();
    
    distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    
    System.out.printf("%.4f%n", distancia);
    
 
    }
 
}