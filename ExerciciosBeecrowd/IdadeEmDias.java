import java.io.IOException;
import java.util.Scanner;

public class IdadeEmDias {
 
    public static void main(String[] args) throws IOException {
 
       int idadeDias;
       int anos;
       int meses;
       int dias;
       
       Scanner scanner = new Scanner (System.in);
       
       idadeDias = scanner.nextInt();
       
       anos = idadeDias / 365;
       meses = (idadeDias%365) / 30;
       dias = (idadeDias % 365) % 30;
       
       System.out.println(anos + " ano(s)");
       System.out.println(meses + " mes(es)");
       System.out.println(dias + " dia(s)");
 
    }
 
}