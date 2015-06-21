import java.awt.Frame;
import java.io.ObjectInputStream.GetField;

import javax.swing.JFrame;

	public class Lines {
        
	    public static void main(String[] args) {
	        DrawLines panel = new DrawLines();
	        Vertice vetice = new Vertice();
	        vetice.setPreto();
	        vetice.setHorizontal(1);
	        vetice.setVertical(20);
	        panel.novoPonto(vetice);
	        
 
	        JFrame frame= new JFrame("Desenhando Linhas - Curso Java Progressivo");

	        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	       
	        
	        
	        frame.setSize( 700,600 );
	        frame.setVisible( true );
	        frame.setLocation(200,0);
	      //  panel.novoPonto(5, 5);
	        
	        frame.add(panel);
	       
	        //panel.novoPonto(5, 5);
	        
	        
	        

	        }
	}