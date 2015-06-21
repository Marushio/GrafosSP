import java.awt.Frame;
import java.io.ObjectInputStream.GetField;

import javax.swing.JFrame;

	public class Lines {
        
	    public static void main(String[] args) {
	        DrawLines panel = new DrawLines();
	        Ponto panel2 = new Ponto();
 
	        JFrame frame= new JFrame("Desenhando Linhas - Curso Java Progressivo");

	        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	        panel.ponto.setPreto();
	        frame.setSize( 700,600 );
	        frame.setVisible( true );
	        frame.setLocation(200,0);
	      //  panel.novoPonto(5, 5);
	        
	        frame.add(panel);
	       
	        //panel.novoPonto(5, 5);
	        
	        
	        

	        }
	}