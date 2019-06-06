import javax.swing.*;
import java.awt.*;
public class ZaretOutputView extends JPanel
{
   private int zari1;
   private int zari2;
 
   public ZaretOutputView(int zari1 ,int zari2)
   {
      JFrame f = new JFrame();
      f.getContentPane().add(this);
      f.setTitle("Zaret");
      f.setSize(400,300);
      f.setVisible(true);
      this.zari1 = zari1;
      this.zari2 = zari2;
   }
	
   public void paintComponent (Graphics g)
   {
      g.setColor(Color.white);
      g.fillRect(0,0,400,300);
      g.setColor(Color.black);
      g.drawRect(120, 100, 50, 50);
      g.drawRect(180, 100, 50, 50);
   	
      g.setColor(Color.red);
      g.fillRect(120,100 , 50, 50);
   	
      g.setColor(Color.red);
      g.fillRect(180, 100, 50, 50);
      
      g.setColor(Color.white);
      if(zari1==6){
         g.drawString(" o      o",125,114);
         g.drawString(" o      o",125,129);
         g.drawString(" o      o",125,144);}
      else if (zari1==5){
         g.drawString(" o      o",125,114);
         g.drawString("    o ",128,129);
         g.drawString(" o      o",125,144);}
      else if (zari1==4){
         g.drawString(" o      o",125,114);
         g.drawString("   ",125,129);
         g.drawString(" o      o",125,144);}
      else if (zari1==3){
         g.drawString(" o  ",125,114);
         g.drawString("    o ",128,129);
         g.drawString("        o",125,144);}
      else if (zari1==2){
         g.drawString(" o  ",125,114);
         g.drawString("   ",125,129);
         g.drawString("        o",125,144);}
      else if (zari1==1){
         g.drawString("   ",125,114);
         g.drawString("    o ",128,129);
         g.drawString("   ",125,144);}
      
      if(zari2==6){
         g.drawString(" o      o",187,114);
         g.drawString(" o      o",187,129);
         g.drawString(" o      o",187,144);}
      else if (zari2==5){
         g.drawString(" o      o",187,114);
         g.drawString("    o ",190,129);
         g.drawString(" o      o",187,144);}
      else if (zari2==4){
         g.drawString(" o      o",187,114);
         g.drawString("   ",187,129);
         g.drawString(" o      o",187,144);}
      else if (zari2==3){
         g.drawString("o  ",187,114);
         g.drawString("   o ",190,129);
         g.drawString("        o",187,144);}
      else if (zari2==2){
         g.drawString(" o  ",187,114);
         g.drawString("   ",188,129);
         g.drawString("        o",187,144);}
      else if (zari2==1){
         g.drawString("   ",187,114);
         g.drawString("   o ",190,129);
         g.drawString("   ",188,144);}
   }	
   public void perserite(int i , int j)
   {
      zari1 = i;
      zari2 = j;
      this.repaint();
   }	
}
