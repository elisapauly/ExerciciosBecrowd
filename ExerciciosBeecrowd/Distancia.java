import java.io.IOException;
import java.util.Scanner;

public class Distancia {
 
    public static void main(String[] args) throws IOException {
 
    int distancia;
    int tempo;
    
    Scanner scanner = new Scanner(System.in);
    
    distancia = scanner.nextInt();
    
    tempo = distancia * 2;
    
    System.out.println(tempo + " minutos");
    
    }
 
}