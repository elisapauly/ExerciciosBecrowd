import java.io.IOException;
import java.util.Scanner;

public class OMaior {

    public static void main(String[] args) throws IOException {

        int A;
        int B;
        int C;
        int maiorAB;
        int maiorABC; 
        
        Scanner scanner = new Scanner(System.in);
        
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        
        maiorAB = (A + B + Math.abs(A - B)) / 2;
        maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
        
        System.out.println(maiorABC + " eh o maior");
    }
}