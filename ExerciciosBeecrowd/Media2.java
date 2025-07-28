import java.io.IOException;
import java.util.Scanner;

public class Media2 {
 
    public static void main(String[] args) throws IOException {
 
        double A;
        double B;
        double C;
        double MEDIA;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        A = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        B = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        C = scanner.nextDouble();
        
        MEDIA = (A + B + C) / 3;
        
        System.out.println("MEDIA = "+MEDIA);
 
    }
 
}