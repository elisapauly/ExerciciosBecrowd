import java.io.IOException;
import java.util.Scanner;

public class Area {
 
    public static void main(String[] args) throws IOException {
 
        double A;
        double B;
        double C;
        double pi = 3.14159;
        double areaTriangulo;
        double areaCirculo;
        double areaTrapezio;
        double areaQuadrado;
        double areaRetangulo;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" ____________ ");
        System.out.println("     AREAS    ");
        System.out.println(" ____________ ");
        
        System.out.println("Digite o primeiro número para o cálculo: ");
        A = scanner.nextDouble();
        
        System.out.println("Digite o segundo número para o cálculo: ");
        B = scanner.nextDouble();
        
        System.out.println("Digite o terceiro número para o cálculo: ");
        C = scanner.nextDouble();
        
        areaTriangulo = (A*C)/2;
        areaCirculo = (pi*(C*C));
        areaTrapezio = (A+B*(C/2));
        areaQuadrado = (B*B);
        areaRetangulo = (A*B);
        
        System.out.println("TRIANGULO: "+areaTriangulo);
        System.out.println("CIRCULO: "+areaCirculo);
        System.out.println("TRAPEZIO: "+areaTrapezio);
        System.out.println("QUADRADO: "+areaQuadrado);
        System.out.println("RETANGULO: "+areaRetangulo);
 
    }
}

