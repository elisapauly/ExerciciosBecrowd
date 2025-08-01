import java.io.IOException;
import java.util.Scanner;
 
       
public class TDARacional {
    
    public static int mdc(int a, int b){
           if (b == 0) return Math.abs(a);
           return mdc (b, a % b);
       }
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++){
            int n1 = sc.nextInt();
            int d1 = sc.nextInt();
            char op = sc.next().charAt(0);
            int n2 = sc.nextInt();
            char slash2 = sc.next().charAt(0);
            int d2 = sc.nextInt();
            
            int num = 0;
            int den = 0;
            
            if (op == '+'){
                num = n1 * d2 + n2 * d1;
                den = d1 * d2;
            } else if (op == '-'){
                num = n1 * d2 - n2 *d1;
                den = d1 * d2;
            } else if (op == '*') {
                num = n1 * n2;
                den = d1 * d2;
            } else if (op == '/') {
                num = n1 * d2;
                den = n2 * d1;
            }
             
             int numOriginal = num;
             int denOriginal = den;
             
             int mdc = mdc(num, den);
             num /= mdc;
             den /=mdc;
             
             if (den < 0) {
                 num *= -1;
                 den *= -1;
             }
             
             System.out.printf("%d/%d = %d/%d%n", numOriginal, denOriginal, num, den);
        } 
        
        sc.close();
 
    }
 
}