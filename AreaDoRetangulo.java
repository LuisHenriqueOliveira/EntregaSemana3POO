import javax.swing.*;

public class AreaDoRetangulo
{
   public static void main(String[] args)
   {
      int base, altura, area;
      base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do retangulo"));
      altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do retangulo"));
      area = base * altura;
      JOptionPane.showMessageDialog(null,"A area do retangulo eh " + area);
   }
}