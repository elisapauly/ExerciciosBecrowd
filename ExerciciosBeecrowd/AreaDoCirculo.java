import java.io.IOException;
import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args) throws IOException {

    double n = 3.14159;
    double area;
    double raio;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o raio: ");
    raio = scanner.nextDouble();
    
    area = (n*(raio*raio));
    
    System.out.println("A = "+area);

    }

}

