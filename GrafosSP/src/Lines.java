import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.io.ObjectInputStream.GetField;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

	public class Lines {
		static JFrame frame;
		static DrawLines panel;
		 
	
        public static void zeraMapa(){
        	//adiciona os vetices
        	panel.novoPonto("01.Araraquara",358,188);
        	panel.novoPonto("02.Araçatuba",222,152);
        	panel.novoPonto("03.Bauru",306,221);
        	panel.novoPonto("04.Campinas",425,258);
        	panel.novoPonto("05.Marilia",250,214);
        	panel.novoPonto("06.Piracicaba",390,246);
        	panel.novoPonto("07.PresidentePrudente",165,210);
        	panel.novoPonto("08.RibeiraoPreto",380,150);
        	panel.novoPonto("09.Santos",468,325);
        	panel.novoPonto("10.SaoJoseCampos",495,277);
        	panel.novoPonto("11.SaoJoseRioPreto",285,127);
        	panel.novoPonto("12.SaoPaulo",450,299);
        	panel.novoPonto("13.Sorocaba",400,296);
	        //adiciona as arestas
	        panel.novaAresta("09-12",468+5 ,325+5 ,450+5 ,299+5);
	        panel.novaAresta("12-13",450+5 ,299+5 ,400+5 ,296+5);
	        panel.novaAresta("12-04",450+5 ,299+5 ,425+5 ,258+5);
	        panel.novaAresta("12-10",450+5 ,299+5 ,495+5 ,277+5);
	        panel.novaAresta("13-03",400+5 ,296+5 ,306+5 ,221+5);
	        panel.novaAresta("13-07",400+5 ,296+5 ,165+5 ,210+5);
	        panel.novaAresta("03-05",306+5 ,221+5 ,250+5 ,214+5);
	        panel.novaAresta("03-02",306+5 ,221+5 ,222+5 ,152+5);	        
	        panel.novaAresta("04-06",425+5 ,258+5 ,390+5 ,246+5);	        
	        panel.novaAresta("04-01",425+5 ,258+5 ,358+5 ,188+5);	        
	        panel.novaAresta("04-08",425+5 ,258+5 ,380+5 ,150+5);	        
	        panel.novaAresta("01-11",358+5 ,188+5 ,285+5 ,127+5);
        }		
	    public static void main(String[] args) {
	    	frame= new JFrame("Mapa de São Paulo");
	    	panel = new DrawLines();
	    	
	        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );	       	        	        
	        frame.setSize( 645,700 );
	        frame.setResizable(false);
	        frame.setVisible(true);
	        frame.setLocation(200,0);
	        //>>>> Jlabels
	        //label origem
	        JLabel lbLabel1 = new JLabel("Origem:");
	        lbLabel1.setHorizontalAlignment(SwingConstants.CENTER);
	        lbLabel1.setBounds(5,500, 65, 27);
	        lbLabel1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
	        lbLabel1.setForeground(Color.red);	       
	        frame.getContentPane().add(lbLabel1);
	        //labelDestino
	        JLabel lbLabel2 = new JLabel("Destino:");
	        lbLabel2.setHorizontalAlignment(SwingConstants.CENTER);
	        lbLabel2.setBounds(5,580, 65, 27);
	        lbLabel2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
	        lbLabel2.setForeground(Color.blue);	       
	        frame.getContentPane().add(lbLabel2);
	        
	        //>>>JcomboBoxs
	        JComboBox jboxOrigem ;
	        JButton ok;
	        
	        JLabel label1;
	        label1=new JLabel("Símbolo do Java");
	       
			label1.setSize(300,100);
	        
	        zeraMapa();
	        
	        frame.add(panel); 
	       // frame.add(label1); 
	        
	        }
	}