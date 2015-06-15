/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


/**
 *
 * @author Marcio
 */
public class Mapa {   
    int[] preD;
    String cidades[];
    double min;
    int nextNode; // min holds the minimum value, nextNode holds the value for the next node.
    double[] distance; // the distance matrix
    double[][] matrix; // the actual matrix
    double[] visited; // the visited array
    public void Mapa(){
        preD = new int[12];
        min = 999;
        nextNode = 0;
        distance = new double[12];
        matrix = new double[12][12];
        visited = new double[12];
        cidades = new String[12];
        //cidades
        cidades[0]="Araraquara";
        cidades[1]="Araçatuba;";
        cidades[2]="Bauru";
        cidades[3]="Campinas";
        cidades[4]="Marília";
        cidades[5]="Piracicaba";
        cidades[6]="Presidente Prudente";
        cidades[7]="Santos";
        cidades[8]="Sorocaba";
        cidades[9]="São José do Rio Preto";
        cidades[10]="São José dos Campos";
        cidades[11]="São Paulo";
        //distancias
        matrix[0][9] =349;
        matrix[2][1] =194;
        matrix[2][4] =107;
        matrix[3][5] =71.3;
        matrix[3][0] =185;
        matrix[3][9] =224;
        matrix[7][11] =73.1;
        matrix[8][2] =245;
        matrix[8][6] =514;
        matrix[11][10] =89.7;
        matrix[11][8] =102;
        matrix[11][3] =95.3;
        
        
        
        for(int i = 0; i < distance.length; i++){
			
            visited[i] = 0; //initialize visited array to zeros

            preD[i] = 0;

            for(int j = 0; j < distance.length; j++){                   

                    if(matrix[i][j]==0){

                            matrix[i][j] = 999; // make the zeros as 999

                    }

            }
			
	}
    }
    
    public void dijkstra(){
        distance = matrix[0]; //initialize the distance array
        visited[0] = 1; //set the source node as visited
        distance[0] = 0; //set the distance from source to source to zero which is the starting point

        for(int counter = 0; counter < 5; counter++){

                min = 999;

                for(int i = 0; i < 12; i++){

                        if(min > distance[i] && visited[i]!=1){

                                min = distance[i];
                                nextNode = i;

                        }

                }

                visited[nextNode] = 1;

                for(int i = 0; i < 12; i++){

                        if(visited[i]!=1){

                                if(min+matrix[nextNode][i] < distance[i]){

                                        distance[i] = min+matrix[nextNode][i];
                                        preD[i] = nextNode;

                                }

                        }

                }

        }

        for(int i = 0; i < distance.length; i++){

                System.out.print("|" + distance[i]);

        }
        System.out.println("|");

        int j;
        for(int i = 0; i < 12; i++){

                if(i!=0){

                        System.out.print("Path = " + i);
                        j = i;
                        do{

                                j=preD[j];
                                System.out.print(" <- " + j);

                        }while(j!=0);

                }

                System.out.println();

        }

	
    }
    
    
}
