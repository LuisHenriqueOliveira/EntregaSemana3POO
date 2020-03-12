import javax.swing.*;

public class SomaDosComprimeitos
{
   public static void main(String[] args)
   {
      String plv1,plv2,plv3;
      plv1 = JOptionPane.showInputDialog("Digite a primeira palavra");
      plv2 = JOptionPane.showInputDialog("Digite a segunda palavra");
      plv3 = JOptionPane.showInputDialog("Digite a terceira palavra");
      int somaComp = plv1.length() + plv2.length() + plv3.length();
      JOptionPane.showMessageDialog(null,somaComp);
   }
}