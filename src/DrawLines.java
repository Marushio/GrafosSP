import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DrawLines extends JPanel{
	
	private ArrayList<Vertice> vetVetice =new ArrayList();
    public void paintComponent(Graphics g){
    
    	Image img = new ImageIcon(getClass().getResource("/imagens/mapaBase.png")).getImage() ;
    	super.paintComponent( g );
    	setOpaque(false);
    	g.drawImage(img, 0, 0, this);
    	for (int i=0;i<vetVetice.size();i++){
    		Vertice vertice =vetVetice.get(i);
    		g.setColor(vertice.getCor());  
    		g.fillOval(vertice.getHorizontal(),vertice.getVertical(), 16,16);
    	}
    }
    public void novoPonto(int horizontal, int vertical){
    	Vertice vetice = new Vertice();
    	vetice.setHorizontal(horizontal);
    	vetice.setVertical(vertical);
    	vetVetice.add(vetice);	
    }
    
}