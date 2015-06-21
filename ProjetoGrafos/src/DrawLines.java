import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DrawLines extends JPanel{
    
    public void paintComponent( Graphics g){
    
    Image img = new ImageIcon("/C:/Users/a1320726/Documents/ProjetoGrafos/src/imagens/mapaBase.png").getImage() ;
    super.paintComponent( g );
    setOpaque(false);
    g.drawImage(img, 0, 0, this);
    
    g.setColor(Color.black);  
    g.fillOval(743, 524, 16,16);
   // g.drawOval(50, 50, 16,16);
    
    
    }
private Image createImage(){
   BufferedImage bufferedImage = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
   Graphics g = bufferedImage.getGraphics();
   g.drawString("www.java2s.com", 20,20);
        
   return bufferedImage;
   }
}