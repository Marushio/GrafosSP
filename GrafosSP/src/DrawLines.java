import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DrawLines extends JPanel{
	
	private ArrayList<Vertice> vetVetice =new ArrayList();
	private ArrayList<Aresta>  vetAresta =new ArrayList();
    public void paintComponent(Graphics g){
    
    	Image img = new ImageIcon(getClass().getResource("/imagens/mapaBase.png")).getImage() ;
    	super.paintComponent( g );
    	setOpaque(false);
    	g.drawImage(img, 0, 0, this);
    	for (int i=0;i<vetVetice.size();i++){
    		Vertice vertice =vetVetice.get(i);
    		g.setColor(vertice.getCor());  
    		g.fillOval(vertice.getHorizontal(),vertice.getVertical(), 10,10);
    	}
    	
    	//desenha as arestas 
    	for (int i=0;i<vetAresta.size();i++){
    		Graphics2D g2d = (Graphics2D) g.create();
    		g2d.setStroke(new BasicStroke((float)3.5));
    		Aresta aresta =vetAresta.get(i);
    		g2d.setColor(aresta.getCor());
    		g2d.drawLine(aresta.getVerticalInicio(), aresta.getHorizontalInicio(), aresta.getVerticalFim(),aresta.getHorizontalFim());
    		g2d.dispose();
    	}
    	
    	
    	
    }
    public void novoPonto(String nome,int horizontal, int vertical){
    	Vertice vertice = new Vertice();
    	vertice.setNome(nome);
    	vertice.setHorizontal(horizontal);
    	vertice.setVertical(vertical);
    	vetVetice.add(vertice);	
    }
    public void novaAresta(String nome,int verticalInicio, int horizontalInicio,int verticalFim, int horizontalFim){
    	Aresta aresta = new Aresta();
    	aresta.setNome(nome);
    	aresta.setHorizontalInicio(horizontalInicio);
    	aresta.setVerticalInicio(verticalInicio);
    	aresta.setHorizontalFim(horizontalFim);
    	aresta.setVerticalFim(verticalFim);
    	vetAresta.add(aresta);
    } 	
}