import java.io.IOException;
import java.util.Scanner;
 
public class Salario {
 
    public static void main(String[] args) throws IOException {
 
        int numero;
        int horas;
        double valorHora; 
        double salario;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Funcionário, digite seu número: ");
        numero = scanner.nextInt();
        
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horas = scanner.nextInt();
        
        System.out.println("Digite o valor que você recebe por hora trabalhada: ");
        valorHora = scanner.nextDouble();
        
        salario = (horas * valorHora);
        
        System.out.println("NUMERO = "+numero);
        System.out.println("SALARIO = R$ "+salario);
 
    }
 
}