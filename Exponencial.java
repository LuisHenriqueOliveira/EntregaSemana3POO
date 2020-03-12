import javax.swing.*;

public class Exponencial
{
   public static void main(String[] args)
   {
   int base, expoente;
   base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base"));
   expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente"));
   double calc = Math.pow(base, expoente);
   JOptionPane.showMessageDialog(null,calc);
   }
}