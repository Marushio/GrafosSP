


	import javax.swing.JFrame;

	public class Lines {

	    public static void main(String[] args) {
	       DrawLines panel = new DrawLines();

	       JFrame frame= new JFrame("Desenhando Linhas - Curso Java Progressivo");

	        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	        frame.setSize( 250, 250 );
	        frame.setVisible( true );
	        frame.add( panel );

	        }
	}