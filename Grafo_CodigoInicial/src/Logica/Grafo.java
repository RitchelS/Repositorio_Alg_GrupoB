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
public interface Grafo {
    	public void cncel();
	
	public int  getSize() throws GrafoException; // cantidad de vertices
	
	public boolean isEmpty() throws GrafoException;// devuelve true si el grafo esta vacio
	
	public void addVertex(Object element) throws GrafoException;
	
	public void addEdge( Object v1, Object v2) throws GrafoException; //agregar aristas
	
	public boolean existVertex(Object element) throws GrafoException;
	
	public boolean existEdge(Object v1, Object v2) throws GrafoException;
	
	
	////ALGORITMOS DE RECORRIODO
	
	public String dfs() throws GrafoException;
	
	public String bfs() throws GrafoException;
	
}
