import javax.swing.*;

public class DiasVividos
{
   public static void main(String[] args)
   {
      int entrada, calc;
      entrada = Integer.parseInt(JOptionPane.showInputDialog("Entre com sua idade"));
      calc = entrada * 365;
      JOptionPane.showMessageDialog(null,"Voce viveu " + calc + "dias");
   }
}