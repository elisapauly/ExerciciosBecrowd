import java.io.IOException;
import java.util.Scanner;

public class ConversaoDeTempo {
   public ConversaoDeTempo() {
   }

   public static void main(String[] var0) throws IOException {
      Scanner var5 = new Scanner(System.in);
      int var1 = var5.nextInt();
      int var2 = var1 / 365;
      var1 %= 365;
      int var3 = var1 / 30;
      int var4 = var1 % 30;
      System.out.println(var2 + " ano(s)");
      System.out.println(var3 + " mes(es)");
      System.out.println(var4 + " dia(s)");
   }
}
