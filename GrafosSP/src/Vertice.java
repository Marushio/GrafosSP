import java.awt.Color;


public class Vertice {
	private String nome;
	private Color cor;
	private int vertical;
	private int horizontal;
	
	public void Vertice(){
		nome = "Sem nome";
		cor = Color.black;
		vertical = 0;
		horizontal =0;	
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
    public int getVertical(){
	
    	return vertical;
    }
    public int getHorizontal(){
	 	return horizontal;
    } 
    public void setNome(String nome){
		this.nome=nome;
  	}
    public void setVertical(int vertical){
  	
    	this.vertical = vertical;
    }
    public void setHorizontal(int horizontal){
  	
      	this.horizontal=horizontal;
    } 
    @Override 
    public String toString() {
        return nome;
    }
}
