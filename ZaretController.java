import javax.swing.*;
public class ZaretController 
{
   public static void main(String[] args)
   {
      Zari zari1 = new Zari();
      int rez1 = zari1.throwZari();
   	
      Zari zari2 = new Zari();
      int rez2 = zari2.throwZari();
   	
      ZaretOutputView o = new ZaretOutputView(rez1 , rez2);
   	
      int i = Integer.parseInt(JOptionPane.showInputDialog("Per te hedhur zaret prap shtyp 1 ne te kunderten shtyp 0"));
      while(i==1)
      {
         rez1 = zari1.throwZari();
         rez2 = zari2.throwZari();
         o.perserite(rez1, rez2);
         i = Integer.parseInt(JOptionPane.showInputDialog("Per te hedhur zaret prap shtyp 1 ne te kunderten shtyp 0"));
      } 	
   }

}
