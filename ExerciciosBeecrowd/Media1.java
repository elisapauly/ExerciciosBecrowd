import java.io.IOException;
import java.util.Scanner;


public class Media1 {

    public static void main(String[] args) throws IOException {

    double A; 
    double B;
    double MEDIA;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite a primeira média: ");
    A = scanner.nextInt();
    
    System.out.println("Digite a segunda média: ");
    B = scanner.nextInt();
    
    MEDIA = ((A+B)/2);
    
    System.out.println("MEDIA = "+MEDIA);
    
    }

}
