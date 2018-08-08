import  java.awt.*;
 class A181 extends Frame
{
  A181()
 {
 this.setTitle("loooo");
 this.setSize(1000,500);
 this.setVisible(true);
 this.setBackground(Color.blue);
 }
 
 public void paint(Graphics g)
 {
 Font f=new Font("arial",Font.BOLD+Font.ITALIC,35);
 g.setFont(f);
 this.setForeground(Color.red);
 g.drawString("himanshu a gya hai ",100,100);
 }
 }
  class Gui182
 {
 public static void main(String l[])
 {
 A181 a=new A181();
 }
 }