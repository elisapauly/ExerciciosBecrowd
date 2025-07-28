import java.io.IOException;
import java.util.Scanner;

public class Esfera {
 
    public static void main(String[] args) throws IOException {
 
       double pi = 3.14159;
       double volume;
       int raio;
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Digite o valor do raio da esfera: ");
       raio = scanner.nextInt();
       
       volume = (4/3 * pi * (raio*raio*raio));
       
       System.out.println("VOLUME = "+volume);
 
    }
 
}