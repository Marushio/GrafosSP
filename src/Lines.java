import java.awt.Frame;
import java.io.ObjectInputStream.GetField;

import javax.swing.JFrame;

	public class Lines {
		static JFrame frame;
		static DrawLines panel;
		 //adiciona os pontos
	
        public static void zeraMapa(){
        	panel.novoPonto(20,20);
	        panel.novoPonto(80,20);
	        panel.novoPonto(100,20);
	        
        	
        }
		
	    public static void main(String[] args) {
	    	frame= new JFrame("Mapa de São Paulo");
	    	panel = new DrawLines();
	        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );	       	        	        
	        frame.setSize( 700,600 );
	        frame.setVisible( true );
	        frame.setLocation(200,0);
	    	
	        zeraMapa();
	        frame.add(panel);   
	        }
	}