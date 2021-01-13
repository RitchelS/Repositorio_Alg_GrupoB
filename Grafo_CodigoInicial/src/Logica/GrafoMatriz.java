/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Ritchel
 */
public class GrafoMatriz implements Grafo{
    
    private Object [][] matrizAd;
	private int count; //contador de vertices
	private int n; //maximo de vertices
	private Vertice [] vert; //Arreglo de vertices

	public GrafoMatriz(int n) {
		this.n = n;

		if(n<0) {
			System.exit(0);
		}

		this.n = n;
		this.count = 0;
		vert = new Vertice[n];
		matrizAd = new Object [n][n];
		initMAtriz();

	}

	private void initMAtriz() {

		for (int i = 0; i < matrizAd.length; i++) {
			for (int j = 0; j < matrizAd[0].length; j++) {
				matrizAd[i][j] = 0;

			}

		}

	}

	@Override
	public void cncel() {
		
		for (int i = 0; i < count; i++) {
			
			vert[i] = null;
			initMAtriz();
			
		}

	}

	@Override
	public int getSize() throws GrafoException {
		
		if(isEmpty()) {
			throw new GrafoException("El grafo esta vacio");
		}
		return 0;
	}

	@Override
	public boolean isEmpty() throws GrafoException {

		return count == 0;

	}

	@Override
	public void addVertex( Object element) throws GrafoException {

		if(count >= vert.length) {
			throw new GrafoException("El grafo esta lleno");
		}else {
			vert[count++] = new Vertice(element);
		}

	}

	@Override
	public void addEdge(Object v1, Object v2) throws GrafoException {
		
		if(!existVertex(v1) || !existVertex(v2))
			throw new GrafoException("Algunas o ambas vertices no existen");
		
		
		//GRafo dirigido
		matrizAd[getPosition(v1)][getPosition(v2)] = 1;
		
		
		/*
		//Grafo no dirigido
		matrizAd[getPosition(v1)][getPosition(v2)] = 1;
		*/

	}

	@Override
	public boolean existVertex(Object element) throws GrafoException {

		if(isEmpty())
			throw new GrafoException("El grafo esta vacio");

		for (int i = 0; i < count; i++) {
			if(vert[i].element.equals(element)) {
				return true;
			}

		}
		return false;
	}


	@Override
	public boolean existEdge(Object v1, Object v2) throws GrafoException {
		
		if(isEmpty())
			throw new GrafoException("No exiate Grafo el cual buscar");
		
		if(matrizAd[getPosition(v1)][getPosition(v2)] != (Object) 0) {
			
			return true;
			
		}else {
			return false;
		}
		
		
		
	}
	
	
	private int getPosition(Object element) {
		
		for (int i = 0; i < count; i++) {
			
			if(vert[i].element.equals(element)) {
				return i;
			}
			
		}
		
		return -1;
		
	}
	
	public String toString() {

		 String resultado="Información del grafo\n";
	        resultado+="Grafo con matriz de adyacencia\n";
	        resultado+="----------------------------\n";
	        
	        for (int i = 0; i < count; i++) {
	            resultado+="El vertice en la posición: "+i+" es: "+vert[i].element+"\n";
	        }
	        
	        
	        
	        resultado+="Aristas y pesos del grafo\n";
	        
	  
	        
	        for (int i = 0; i < count; i++) {
	            for (int j = 0; j < count; j++) {
	                if(matrizAd[i][j]!=(Object)0){
	                    resultado+=vert[i].element+"---------->"+vert[j].element+"\n";
	                }
	            }
	        }

	        
	        for (int i=0;i<n;i++){
	            for (int j=0; j<n; j++){
	                resultado+=matrizAd[i][j]+" ";
	            }
	            resultado+="\n";
	        }
	        return resultado;

	}


	@Override
	public String dfs() throws GrafoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String bfs() throws GrafoException {
		// TODO Auto-generated method stub
		return null;
	}

}
