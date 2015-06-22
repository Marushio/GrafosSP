import java.awt.Color;


public class Aresta {
	private String nome;
	private Color cor;
	private int verticalInicio;
	private int horizontalInicio;
	private int verticalFim;
	private int horizontalFim;
	
	public void Vertice(){
		nome = "Sem nome";
		cor = Color.black;
		verticalInicio = 0;
		horizontalInicio = 0;
		verticalFim = 50;
		horizontalFim = 50;
	}
	
	public Color getCor(){
		return cor;
	}
	public void setPreto(){
		
		this.cor=Color.black;
	}
	public void setVermelho(){
		
		this.cor=Color.red;
	}
    public void setVerde(){
	
	    this.cor=Color.green;
    }
    public String getNome(){
		
		return nome;
	}
    public void setNome(String nome){
		this.nome=nome;
  	}
    public int getVerticalInicio(){
	
    	return verticalInicio;
    }    
    public void setVerticalInicio(int verticalInicio){
  	
    	this.verticalInicio = verticalInicio;
    }
    public int getHorizontalInicio(){
	 	return horizontalInicio;
    } 
    public void setHorizontalInicio(int horizontalInicio){
  	
      	this.horizontalInicio=horizontalInicio;
    }
    public int getVerticalFim(){
    	
    	return verticalFim;
    }    
    public void setVerticalFim(int verticalFim){
  	
    	this.verticalFim = verticalFim;
    }
    public int getHorizontalFim(){
 	 	return horizontalFim;
     } 
     public void setHorizontalFim(int horizontalFim){
   	
       	this.horizontalFim=horizontalFim;
     }
}
