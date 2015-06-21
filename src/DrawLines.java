import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DrawLines extends JPanel{
	Ponto ponto = new Ponto();
    public void paintComponent(Graphics g){
    
    Image img = new ImageIcon(getClass().getResource("/imagens/mapaBase.png")).getImage() ;
    super.paintComponent( g );
    setOpaque(false);
    g.drawImage(img, 0, 0, this);
    
    g.setColor(ponto.cor);  
    g.fillOval(743, 524, 16,16);
   // g.drawOval(50, 50, 16,16);
    
    
    }
    
    public void novoPonto(int l,int h){
    	Graphics g = super.getGraphics();
    	//g.setColor(Color.black);  
        g.fillOval(l, h, 16,16);
        
        
        //g.drawOval(50, 50, 16,16);
    }
    
}