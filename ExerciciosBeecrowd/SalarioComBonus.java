import java.io.IOException;
import java.util.Scanner;

public class SalarioComBonus {
 
    public static void main(String[] args) throws IOException {
 
        String vendedor;
        double salarioFixo;
        double valorVendas;
        double comissao = 0.15;
        double total; 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        vendedor = scanner.nextLine();
        
        System.out.println("Digite seu salário fixo: ");
        salarioFixo = scanner.nextDouble();
        
        System.out.println("Digite o valor das vendas: ");
        valorVendas = scanner.nextDouble();
        
        total = (salarioFixo + (valorVendas*comissao));
        
        System.out.println("TOTAL = R$ "+total);
 
    }
 
}
